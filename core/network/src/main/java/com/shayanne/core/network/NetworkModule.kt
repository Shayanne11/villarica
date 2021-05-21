package com.shayanne.core.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit

fun networkModule(
    baseUrl: String,
){
    val okHttpClient = OkHttpClient.Builder()

    Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient.build())
        .build()
        .create(EmporiumService::class.java)

}