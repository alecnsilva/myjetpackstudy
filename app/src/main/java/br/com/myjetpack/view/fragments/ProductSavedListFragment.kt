package br.com.myjetpack.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import br.com.myjetpack.BaseFragment
import br.com.myjetpack.R
import br.com.myjetpack.data.local.ProductModel
import br.com.myjetpack.databinding.FragmentProductListBinding
import br.com.myjetpack.extentions.isVisible
import br.com.myjetpack.view.ProductListViewCommand
import br.com.myjetpack.view.adapters.SavedItemsAdapter
import br.com.myjetpack.viewmodel.ProductListViewModel
import kotlinx.android.synthetic.main.fragment_product_list.*
import org.koin.android.viewmodel.ext.android.sharedViewModel

/**
 *Created by alecnsilva
 */

class ProductSavedListFragment : BaseFragment() {

    private val viewModel by sharedViewModel<ProductListViewModel>()
    private lateinit var binding: FragmentProductListBinding
    private lateinit var adapter: SavedItemsAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getDataBinding(inflater, container, R.layout.fragment_product_list)
        binding.viewModel = viewModel
        setupObservers()
        viewModel.loadSavedProducts()
        return binding.root
    }

    private fun setupObservers() {
        binding.btnSavedProducts.isVisible(false)
        viewModel.command.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ProductListViewCommand.LoadingProducts -> showLoad()

                is ProductListViewCommand.ProductRemoved -> {
                    showLoad()
                    viewModel.loadSavedProducts()
                }

                is ProductListViewCommand.ProductsLoaded -> {
                    hideLoad()
                    setUpAdapter(it.products)
                }

                is ProductListViewCommand.Error -> {
                    hideLoad()
                    showToast(it.error)
                }

                is ProductListViewCommand.GoToDetail -> findNavController().navigate(R.id.action_savedListFragment_to_detailFragment)
            }
        })
    }

    private fun setUpAdapter(products: List<ProductModel>) {
        adapter = SavedItemsAdapter(
            viewModel,
            products.sortedBy { it.title })
        recyclerProducts.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    private fun showToast(msg: String?) {
        Toast.makeText(requireContext(), msg ?: "Saved Products not found!", Toast.LENGTH_SHORT).show()
    }

    private fun showLoad() {
        recyclerProducts.isVisible(false)
        progressBar.isVisible(true)
    }

    private fun hideLoad() {
        recyclerProducts.isVisible(true)
        progressBar.isVisible(false)
    }
}

