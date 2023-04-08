package com.example.mvvmapi.data.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvmapi.data.models.user.UserModelItem

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(userModelItem: UserModelItem)

    @Query("SELECT * from user")
    fun getAllUsers(): LiveData<List<UserModelItem>>
}