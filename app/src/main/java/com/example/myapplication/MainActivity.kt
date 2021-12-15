package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.myapplication.adapters.PageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var PageAdapter: PageAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager2=findViewById(R.id.viewPager)
        tabLayout= findViewById(R.id.tabBar)
        PageAdapter= PageAdapter(this)

        viewPager2.adapter=PageAdapter

        TabLayoutMediator(tabLayout, viewPager2) {tab, position ->
            tab.text= "Tab ${position+1}"
        }.attach()


    }
}