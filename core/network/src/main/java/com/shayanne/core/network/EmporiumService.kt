package com.shayanne.core.network

import retrofit2.http.GET
import retrofit2.http.Query

interface EmporiumService {
    @GET("v3/361b1297-b135-4fda-aa8e-951c96f4a61b")
    suspend fun getRepos(
    @Query("page") pageNumber: Int
    )

}
