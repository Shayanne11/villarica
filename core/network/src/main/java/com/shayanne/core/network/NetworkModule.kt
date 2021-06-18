package com.shayanne.core.network

import com.shayanne.core.network.adapter.RepositoryAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

const val BASE_URL ="https://run.mocky.io/"

val  networkModule = module {
    val okHttpClient = OkHttpClient.Builder()

    okHttpClient.addInterceptor(HttpLoggingInterceptor())

    val moshi = Moshi.Builder()
        .add(RepositoryAdapter())
        .addLast(KotlinJsonAdapterFactory())
        .build()


    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(okHttpClient.build())
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()
        .create(EmporiumService::class.java)

}

