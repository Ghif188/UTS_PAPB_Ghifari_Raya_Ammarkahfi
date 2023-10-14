package com.example.utspapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utspapb.databinding.ActivityMain2Binding
import com.example.utspapb.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val namaFilm = intent.extras?.getString("NamaFilm")
        val rateFilm = intent.extras?.getString("RateFilm")
        val directorFilm = intent.extras?.getString("DirectorFilm")
        val storyFilm = intent.extras?.getString("StoryFilm")

        with(binding){
            judul.text = namaFilm
            rate.text = rateFilm
            director.text = directorFilm
            story.text = storyFilm
            back.setOnClickListener{
                startActivity(Intent(this@MainActivity3, MainActivity2::class.java))
            }
            val intentToFourthActivity = Intent(this@MainActivity3, MainActivity4::class.java)
            val extras = Bundle()
            beliTiket.setOnClickListener{
                extras.putString("NamaFilm", namaFilm)
                extras.putString("RateFilm", rateFilm)
                extras.putString("DirectorFilm", directorFilm)
                extras.putString("StoryFilm", storyFilm)
                intentToFourthActivity.putExtras(extras)
                startActivity(intentToFourthActivity)
            }
        }
    }
}