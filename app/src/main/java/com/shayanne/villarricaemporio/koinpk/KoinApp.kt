package com.shayanne.villarricaemporio.koinpk

import android.app.Application
import com.shayanne.core.network.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class KoinApp : Application(){

        override fun onCreate() {
            super.onCreate()
            // Start Koin
            startKoin{
                androidLogger()
                androidContext(this@KoinApp)
                modules(listOf( networkModule,homeModule))
            }
        }

}