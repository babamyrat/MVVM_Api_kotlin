package com.example.mvvmapi.data.network

import com.example.mvvmapi.data.models.home.HomeModel
import com.example.mvvmapi.data.models.user.UserModel
import com.example.mvvmapi.utils.Constant.URL_HOME
import com.example.mvvmapi.utils.Constant.URL_USER
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET(URL_HOME)
    suspend fun getApiHome():Response<HomeModel>
    //https://api.npoint.io/33faa92b9dcc22f57ec3

    @GET(URL_USER)
    suspend fun getApiUser():Response<UserModel>
    //https://api.npoint.io/cbbd0005fecdd64a65e3

    }