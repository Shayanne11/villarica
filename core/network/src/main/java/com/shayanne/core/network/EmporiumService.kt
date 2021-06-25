package com.shayanne.core.network

import com.shayanne.core.model.RepositoryWrapper
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface EmporiumService {
    @GET("v3/361b1297-b135-4fda-aa8e-951c96f4a61b")
     fun getRepos(
    @Query("page") pageNumber: Int
    ):Call<RepositoryWrapper>

}













