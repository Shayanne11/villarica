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
                // wes: Comentei isso aqui. Aparentemente tem um bug
//                androidLogger()
//                printLogger()
                androidContext(this@KoinApp)
                modules(listOf( networkModule,homeModule))
            }
        }

}