package com.example.mvvmapi.data.network

import com.example.mvvmapi.data.models.model.HomeModel
import com.example.mvvmapi.data.models.model.UserModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("33faa92b9dcc22f57ec3")
    suspend fun getApiHome():Response<HomeModel>
    //https://api.npoint.io/33faa92b9dcc22f57ec3

    @GET("cbbd0005fecdd64a65e3")
    suspend fun getApiUser():Response<UserModel>
    //https://api.npoint.io/cbbd0005fecdd64a65e3

    }