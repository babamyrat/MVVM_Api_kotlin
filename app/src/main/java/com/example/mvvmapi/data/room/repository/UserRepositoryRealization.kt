package com.example.mvvmapi.data.room.repository

import androidx.lifecycle.LiveData
import com.example.mvvmapi.data.models.user.UserModelItem
import com.example.mvvmapi.data.room.dao.UserDao

class UserRepositoryRealization(private val userDao: UserDao): UserRepository {
    override val allUsers: LiveData<List<UserModelItem>>
        get() = userDao.getAllUsers()

    override suspend fun insertUsers(userModelItem: UserModelItem, onSuccess: () -> Unit) {
        userDao.insert(userModelItem)
        onSuccess()
    }
}