package com.example.mvvmapi.data.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mvvmapi.data.models.user.UserModelItem
import com.example.mvvmapi.data.room.dao.UserDao

@Database(entities = [UserModelItem::class], version = 2)
abstract class UserAppDatabase : RoomDatabase() {
  abstract fun getUserDao(): UserDao

  companion object{
      private var database: UserAppDatabase ?= null

      fun getInstance(context: Context): UserAppDatabase {
          return if (database == null){
              database = Room
                  .databaseBuilder(context, UserAppDatabase::class.java, "db")
                  .build()

              database as UserAppDatabase

          }else{
              database as UserAppDatabase
          }
      }
  }
}