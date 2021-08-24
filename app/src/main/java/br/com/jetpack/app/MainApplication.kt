package br.com.jetpack.app

import android.app.Application
import br.com.jetpack.extentions.startKoinApp

/**
 * Created by Alec N Silva
 * Prj MyJetPackStudy
 * Date
 */

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoinApp()
    }
}
