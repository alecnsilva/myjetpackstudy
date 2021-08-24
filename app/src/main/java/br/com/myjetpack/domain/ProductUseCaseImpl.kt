package br.com.myjetpack.domain

import br.com.myjetpack.data.local.ProductMock
import br.com.myjetpack.data.local.ProductModel
import br.com.myjetpack.data.repository.ProductRepository
import br.com.myjetpack.extentions.savedToProductModel
import br.com.myjetpack.extentions.toProductModel
import br.com.myjetpack.extentions.toProductsEntity

/**
 *Created by alecnsilva
 */

class ProductUseCaseImpl(private val repository: ProductRepository) : ProductUseCase {

    override suspend fun getProducts(): List<ProductModel> = try {
        repository.getProducts().toProductModel()
    } catch (throwable: Throwable) {
        throw throwable
    }

    override suspend fun getSavedProducts(): List<ProductModel> = try {
        repository.getSavedProducts().savedToProductModel()
    } catch (throwable: Throwable) {
        throw throwable
    }

    override suspend fun saveProduct(productModel: ProductModel) = try {
        takeIf { productModel.savedUnits == 0 }?.also {
            productModel.savedUnits = 1
        }
        repository.saveProduct(productModel.toProductsEntity())
    } catch (throwable: Throwable) {
        throw throwable
    }

    override suspend fun removeProduct(productModel: ProductModel) = try {
        repository.removeProduct(productModel.toProductsEntity())
    } catch (throwable: Throwable) {
        throw throwable
    }

    override suspend fun initMock() = try {
        repository.saveMockProduct(ProductMock.productMock)
    } catch (throwable: Throwable) {
        throw throwable
    }

}