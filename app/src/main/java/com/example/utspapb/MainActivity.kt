package com.example.utspapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utspapb.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            val intentToSecondActivity2 =
                Intent(this@MainActivity, MainActivity2::class.java)
            btnLogin.setOnClickListener {
                val extras = Bundle()
                if (username.text.toString() == "" || password.text.toString() == ""){
                    warnError.text = "- kolom wajib terisi semua -"
                } else if (username.text.toString() != "Ghifari" || password.text.toString() != "123") {
                    warnError.text = "- User salah -"
                } else {
                    intentToSecondActivity2.putExtra("Username", username.text.toString())
                    startActivity(intentToSecondActivity2)
                }
            }
        }
    }
}