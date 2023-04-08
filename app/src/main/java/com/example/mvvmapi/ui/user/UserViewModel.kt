package com.example.mvvmapi.ui.user

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmapi.data.models.user.UserModel
import com.example.mvvmapi.data.room.UserAppDatabase
import com.example.mvvmapi.data.room.repository.UserRepositoryRealization
import com.example.mvvmapi.di.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class UserViewModel(application: Application): AndroidViewModel(application) {

    var repo = Repository()
    val myUserList: MutableLiveData<Response<UserModel>> = MutableLiveData()
    //room
    lateinit var realization: UserRepositoryRealization
    val content = application

    fun getViewUser() {
        viewModelScope.launch {
            myUserList.value = repo.getRepoUser()
        }
    }

    fun initDatabase() {
        val daoUsers = UserAppDatabase.getInstance(content).getUserDao()
        realization = UserRepositoryRealization(daoUsers)
    }
}