package com.example.news.ui.activities.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.NavHostController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.news.R
import kotlinx.android.synthetic.main.activity_main_bottom_navigation.*

class HomeActivity:AppCompatActivity(R.layout.activity_main_bottom_navigation) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navigation_host) as NavHostFragment
        btm_navigation.setupWithNavController(navController = navHostFragment.navController)



    }
}