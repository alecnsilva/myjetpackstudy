package br.com.myjetpack.di

import androidx.room.Room
import br.com.myjetpack.data.local.database.DataBase
import br.com.myjetpack.data.repository.ProductRepository
import br.com.myjetpack.data.repository.ProductRepositoryImpl
import br.com.myjetpack.domain.ProductUseCase
import br.com.myjetpack.domain.ProductUseCaseImpl
import br.com.myjetpack.viewmodel.ProductListViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

/**
 *Created by alecnsilva
 */

object Modules {
    private val dataModule = module {
        single {
            Room.databaseBuilder(get(), DataBase::class.java, "product-db")
                .fallbackToDestructiveMigration()
                .build()
        }
        factory<ProductRepository> { ProductRepositoryImpl(get()) }
    }

    private val domainModule = module {
        factory<ProductUseCase> { ProductUseCaseImpl(get()) }
    }

    private val viewModule = module {
        viewModel { ProductListViewModel(get()) }
    }

    fun loadModules() {
        loadKoinModules(listOf(dataModule, domainModule, viewModule))
    }
}
