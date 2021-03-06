package br.com.myjetpack.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.myjetpack.data.local.ProductModel
import br.com.myjetpack.databinding.ViewSavedItemBinding
import br.com.myjetpack.viewmodel.ProductListViewModel


/**
 *Created by alecnsilva
 */

class SavedItemsAdapter(
    private val viewModelProduct: ProductListViewModel,
    private var items: List<ProductModel>
) : RecyclerView.Adapter<SavedItemsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewSavedItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding, parent.context)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val productModel = items[position]
        holder.bind(productModel)
    }

    inner class ViewHolder(
        private val binding: ViewSavedItemBinding,
        private val context: Context
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(productModel: ProductModel) {
            with(binding) {
                viewModel = viewModelProduct
                this.productModel = productModel

                imageProduct.setImageDrawable(ContextCompat.getDrawable(context, productModel.img))

                if (productModel.promoPrice.isNotEmpty())
                    price.setPromoSpannableText(productModel.price, productModel.promoPrice)
                else
                    price.text = productModel.price

            }
        }
    }

}
