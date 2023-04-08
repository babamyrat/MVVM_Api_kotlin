package com.example.mvvmapi.ui.home
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvmapi.R
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        recyclerView = view.rv_home
        adapter = HomeAdapter()
        recyclerView.adapter = adapter
        viewModel.getViewHome()
        viewModel.myHomeList.observe(viewLifecycleOwner) {list->
            list.body()?.let {
                adapter.setList(it)
            }
        }

        return view
    }


}