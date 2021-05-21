package com.shayanne.core.network

import com.shayanne.core.network.adapter.RepositoryAdapter
import com.shayanne.core.network.dto.EmporiumService
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

fun networkModule(
    baseUrl: String,
){
    val okHttpClient = OkHttpClient.Builder()

    val moshi = Moshi.Builder()
        .add(RepositoryAdapter())
        .addLast(KotlinJsonAdapterFactory())
        .build()


    Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(okHttpClient.build())
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
        .create(EmporiumService::class.java)

}