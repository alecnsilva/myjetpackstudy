package br.com.myjetpack.view.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.myjetpack.data.local.ProductModel
import br.com.myjetpack.databinding.ViewItemBinding
import br.com.myjetpack.viewmodel.ProductListViewModel

/**
 *Created by alecnsilva
 */

class ItemsAdapter(
    private val viewModelProduct: ProductListViewModel,
    private var items: List<ProductModel>
) : RecyclerView.Adapter<ItemsAdapter.ViewHolder>() {

    var onEditClickListener: (ProductModel, Int) -> Unit = { _, _ -> }
    var onStockLevelMaxListener: (Int?) -> Unit = {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ViewItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding, parent.context)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val productModel = items[position]
        holder.bind(productModel)
    }

    inner class ViewHolder(
        private val binding: ViewItemBinding,
        private val context: Context
    ) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(productModel: ProductModel) {
            with(binding) {
                viewModel = viewModelProduct
                this.productModel = productModel

                imageProduct.setImageDrawable(ContextCompat.getDrawable(context, productModel.img))

                if (productModel.promoPrice.isNotEmpty() && productModel.price.isNotEmpty())
                    price.setPromoSpannableText(productModel.price, productModel.promoPrice)
                else
                    price.text = productModel.price

                amountButton.setStockLevel(productModel.availableUnits)

                amountButton.onAmountChangeListener = {
                    binding.productModel = productModel.apply {
                        this.savedUnits = it
                    }
                    onEditClickListener(productModel, it)
                }

                amountButton.onStockLevelMaxListener = {
                    onStockLevelMaxListener(productModel.availableUnits)
                }
            }
        }
    }

}
