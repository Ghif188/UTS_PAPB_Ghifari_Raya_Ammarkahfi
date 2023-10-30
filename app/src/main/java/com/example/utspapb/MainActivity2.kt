package com.example.utspapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.utspapb.databinding.ActivityMain2Binding
import com.example.utspapb.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(DashboardFragment())
        binding.bottomNavbar.setOnItemReselectedListener {
            when(it.itemId){
                R.id.nav_home->replaceFragment(DashboardFragment())
                R.id.nav_history->replaceFragment(HistroyFragment())
                R.id.nav_profile->replaceFragment(ProfileFragment())
                else->{}
            }
            true
        }
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}