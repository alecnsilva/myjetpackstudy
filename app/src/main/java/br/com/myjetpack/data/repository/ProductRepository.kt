package br.com.myjetpack.data.repository

import br.com.myjetpack.data.local.database.entity.ProductEntity
import br.com.myjetpack.data.local.database.entity.SavedProductEntity

interface ProductRepository {

    suspend fun getProducts(): List<ProductEntity>

    suspend fun getSavedProducts(): List<SavedProductEntity>

    suspend fun saveProduct(savedProductEntity: SavedProductEntity)

    suspend fun removeProduct(savedProductEntity: SavedProductEntity)

    suspend fun saveMockProduct(productEntity: List<ProductEntity>)

}