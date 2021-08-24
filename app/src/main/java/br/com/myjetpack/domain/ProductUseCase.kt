package br.com.myjetpack.domain

import br.com.myjetpack.data.local.ProductModel

interface ProductUseCase {

    suspend fun getProducts(): List<ProductModel>

    suspend fun getSavedProducts(): List<ProductModel>

    suspend fun saveProduct(productModel: ProductModel)

    suspend fun removeProduct(productModel: ProductModel)

    suspend fun initMock()
}
