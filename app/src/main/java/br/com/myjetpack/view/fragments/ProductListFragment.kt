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
import br.com.myjetpack.view.adapters.ItemsAdapter
import br.com.myjetpack.viewmodel.ProductListViewModel
import kotlinx.android.synthetic.main.fragment_product_list.*
import org.koin.android.viewmodel.ext.android.sharedViewModel

/**
 *Created by alecnsilva
 */

class ProductListFragment : BaseFragment() {

    private val viewModel by sharedViewModel<ProductListViewModel>()
    private lateinit var binding: FragmentProductListBinding
    private lateinit var adapter: ItemsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel.initMock()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = getDataBinding(inflater, container, R.layout.fragment_product_list)
        binding.viewModel = viewModel
        setupObservers()
        viewModel.loadProducts()
        return binding.root
    }

    private fun setupObservers() {
        binding.btnSavedProducts.isVisible(true)

        viewModel.command.observe(viewLifecycleOwner, Observer {
            when (it) {
                is ProductListViewCommand.LoadingProducts -> showLoad()

                is ProductListViewCommand.ProductSaved -> showMsg("Product Saved!")

                is ProductListViewCommand.ProductsLoaded -> {
                    hideLoad()
                    setUpAdapter(it.products)
                }

                is ProductListViewCommand.Error -> {
                    hideLoad()
                    showMsg(it.error)
                }

                is ProductListViewCommand.GoToDetail -> findNavController().navigate(R.id.action_listFragment_to_detailFragment)

                is ProductListViewCommand.GoToSavedProduct -> findNavController().navigate(R.id.action_listFragment_to_savedListFragment)
            }
        })
    }

    private fun setUpAdapter(products: List<ProductModel>) {
        adapter = ItemsAdapter(
            viewModel,
            products.sortedBy { it.title })
        recyclerProducts.adapter = adapter
        adapter.notifyDataSetChanged()

        adapter.onEditClickListener = { _, _ ->

        }
        adapter.onStockLevelMaxListener = {
            showMsg("Max Items!")
        }
    }

    private fun showMsg(msg: String?) {
        Toast.makeText(requireContext(), msg ?: "Error", Toast.LENGTH_SHORT).show()
    }

    private fun showLoad() {
        recyclerProducts.isVisible(false)
        progressBar.isVisible(true)
    }

    private fun hideLoad() {
        recyclerProducts.isVisible(true)
        progressBar.isVisible(false)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.command.removeObservers(viewLifecycleOwner)
    }
}

