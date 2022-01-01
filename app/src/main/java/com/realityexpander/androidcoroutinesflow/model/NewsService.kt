package com.realityexpander.androidcoroutinesflow.model

import com.realityexpander.androidcoroutinesretrofit.model.NewsArticle
import retrofit2.http.GET

interface NewsService {
    @GET("news.json")
    suspend fun getNews(): List<NewsArticle>
}