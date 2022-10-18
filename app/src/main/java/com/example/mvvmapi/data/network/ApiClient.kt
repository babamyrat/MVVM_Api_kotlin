package com.example.mvvmapi.data.network

import com.example.mvvmapi.utils.Constant.URL_SITE
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiClient {
      private val retrofit by lazy {
          Retrofit.Builder().baseUrl(URL_SITE)
              .addConverterFactory(GsonConverterFactory.create())
              .build()
      }

     val api: ApiService by lazy {
         retrofit.create(ApiService::class.java)
     }
    }