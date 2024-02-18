package com.sales.articleapp.data.datasource

import com.sales.articleapp.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    fun getNewsHeadline(country: String): Response<NewsResponse>
}