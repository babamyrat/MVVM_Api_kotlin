package com.example.mvvmapi.data.room.repository

import androidx.lifecycle.LiveData
import com.example.mvvmapi.data.models.user.UserModelItem

interface UserRepository {
    val allUsers:LiveData<List<UserModelItem>>
    suspend fun insertUsers(userModelItem: UserModelItem, onSuccess:() -> Unit)
}