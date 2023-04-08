package com.example.mvvmapi.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmapi.data.models.home.HomeModel
import com.example.mvvmapi.di.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response

class HomeViewModel: ViewModel() {
    var repo = Repository()
    val myHomeList: MutableLiveData<Response<HomeModel>> = MutableLiveData()

    fun getViewHome() {
        viewModelScope.launch {
            myHomeList.value = repo.getRepoHome()
        }
    }

}