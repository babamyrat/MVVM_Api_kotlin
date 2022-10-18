package com.example.mvvmapi.di.repository

import com.example.mvvmapi.data.models.model.HomeModel
import com.example.mvvmapi.data.models.model.UserModel
import com.example.mvvmapi.data.network.ApiClient
import retrofit2.Response

class Repository {
    suspend fun getRepoHome(): Response<HomeModel> {
        return ApiClient.api.getApiHome()
    }

    suspend fun getRepoUser(): Response<UserModel> {
        return ApiClient.api.getApiUser()
    }
}