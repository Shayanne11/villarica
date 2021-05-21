package com.shayanne.core.network

import retrofit2.http.GET
import retrofit2.http.Query

interface EmporiumService {
    @GET("v3/2e67e1c9-1c3f-47a9-a064-fdf84d6c0b25")
    suspend fun getRepos(
    @Query("page") pageNumber: Int
    )

}
