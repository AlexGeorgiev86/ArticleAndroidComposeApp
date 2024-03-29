package com.sales.articleapp.data.api

import com.sales.articleapp.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "affbd8e98c0a40bfb81a2206300f21c3",
    ) : Response<NewsResponse>
}