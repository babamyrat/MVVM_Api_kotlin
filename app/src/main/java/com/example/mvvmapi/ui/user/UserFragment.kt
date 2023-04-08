package com.example.mvvmapi.ui.user

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmapi.R

import kotlinx.android.synthetic.main.fragment_user.view.*


class UserFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: UserAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this)[UserViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_user, container, false)
        viewModel.initDatabase()
        recyclerView = view.rv_user
        adapter = UserAdapter()
        recyclerView.adapter = adapter
        viewModel.getViewUser()
        viewModel.myUserList.observe(viewLifecycleOwner){ list->
            list.body()?.let {
                adapter.setList(it)
            }
        }


        return view
    }


}