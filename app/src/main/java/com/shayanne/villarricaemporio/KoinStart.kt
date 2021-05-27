package com.shayanne.villarricaemporio

import android.app.Application
import org.koin.core.context.startKoin

class KoinStart: Application() {

    override fun onCreate() {
        super.onCreate()
        // Start Koin
        startKoin{
            androidLogger()
            androidContext(this@KoinStart)
            modules(appModule)
        }
    }
}