package com.example.news.network

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {

    val newsApiObject : NewsApi by lazy {

        Retrofit
            .Builder()
            .baseUrl("https://football360.ir/api/cms/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }
}