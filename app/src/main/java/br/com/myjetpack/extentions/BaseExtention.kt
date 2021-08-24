package br.com.myjetpack.extentions

import android.app.Application
import br.com.myjetpack.di.Modules
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 *Created by alecnsilva
 */

fun Application.startKoinApp() {
    startKoin {
        androidContext(this@startKoinApp)
        androidLogger()
        Modules.loadModules()
    }
}