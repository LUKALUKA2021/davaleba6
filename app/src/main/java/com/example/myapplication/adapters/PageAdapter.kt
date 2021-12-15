package com.example.myapplication.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.fragments.FirstFragment
import com.example.myapplication.fragments.SecondFragment
import com.example.myapplication.fragments.ThirdFragment

class PageAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0-> FirstFragment()
            1-> SecondFragment()
            2-> ThirdFragment()
            else -> FirstFragment()
        }
    }
}