package br.com.myjetpack.app

import android.app.Application
import br.com.myjetpack.extentions.startKoinApp

/**
 * Created by Alec N Silva
 */

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoinApp()
    }
}
