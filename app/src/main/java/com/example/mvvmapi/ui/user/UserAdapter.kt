package com.example.mvvmapi.ui.user

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmapi.R
import com.example.mvvmapi.data.models.user.UserModelItem
import kotlinx.android.synthetic.main.item_users.view.*

 class UserAdapter:RecyclerView.Adapter<UserAdapter.UserViewHolder>() {

    private var listUser = emptyList<UserModelItem>()

    class UserViewHolder(view: View):RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.item_users, parent, false)
     return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.itemView.txtYearUser.text = listUser[position].age
        holder.itemView.txtFNameUser.text = listUser[position].fname

        Glide.with(holder.itemView)
            .load(listUser[position].image)
            .into(holder.itemView.imageUser)

        holder.itemView.txtLNameUser.text = listUser[position].lname

    }

    override fun getItemCount(): Int {
        return listUser.size
    }

     @SuppressLint("NotifyDataSetChanged")
     fun setList(list: List<UserModelItem>){
        listUser = list
         notifyDataSetChanged()
    }
}