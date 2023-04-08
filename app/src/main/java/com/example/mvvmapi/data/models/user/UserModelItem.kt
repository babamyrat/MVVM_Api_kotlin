package com.example.mvvmapi.data.models.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserModelItem(
    @PrimaryKey(autoGenerate = true)
    val uid: Int,
    @ColumnInfo(name = "age")
    val age: String,
    @ColumnInfo(name = "fname")
    val fname: String,
    @ColumnInfo(name = "image")
    val image: String,
    @ColumnInfo(name = "lname")
    val lname: String
)