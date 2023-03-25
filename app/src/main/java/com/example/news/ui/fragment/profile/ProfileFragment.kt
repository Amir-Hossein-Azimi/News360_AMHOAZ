package com.example.news.ui.fragment.profile

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.news.R
import com.example.news.ui.adapter.NewsViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.fragment_profile.*

class ProfileFragment : Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewpager.adapter = NewsViewPagerAdapter(this@ProfileFragment)

        TabLayoutMediator(tab , viewpager){
            tab , position -> when(position){
                0->{tab.text = "اخبار ایران"}
                1->{tab.text = "اخبار خارجی"}
                2 ->{tab.text = "اخبار اروپایی"}
            }
        }.attach()

    }
}
