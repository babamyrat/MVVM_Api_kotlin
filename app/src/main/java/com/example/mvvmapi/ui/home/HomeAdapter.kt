package com.example.mvvmapi.ui.home

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmapi.R
import com.example.mvvmapi.data.models.home.HomeModelItem
import kotlinx.android.synthetic.main.item_home.view.*

class HomeAdapter: RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    private var listHome = emptyList<HomeModelItem>()

    class HomeViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_home, parent, false)
        return HomeViewHolder(view)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {

        holder.itemView.txtYearHome.text = listHome[position].age

        Glide.with(holder.itemView)
            .load(listHome[position].image)
            .into(holder.itemView.imageHome)

        holder.itemView.txtNameHome.text = listHome[position].name

    }

    override fun getItemCount(): Int {
        return listHome.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<HomeModelItem>){
        listHome = list
        notifyDataSetChanged()
    }
}