package com.example.mvvmapi.ui.adapters.pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.mvvmapi.ui.screen.fragment.HomeFragment
import com.example.mvvmapi.ui.screen.fragment.UserFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity):FragmentStateAdapter(fragmentActivity){
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> HomeFragment()
            else -> UserFragment()
        }
    }
}