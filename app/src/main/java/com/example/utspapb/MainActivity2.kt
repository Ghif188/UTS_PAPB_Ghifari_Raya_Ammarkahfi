package com.example.utspapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utspapb.databinding.ActivityMain2Binding
import com.example.utspapb.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val usernameAkun = intent.extras?.getString("Username")
        with(binding){
            username.text = usernameAkun
            val intentToThirdActivity =
                Intent(this@MainActivity2, MainActivity3::class.java)
            poster1.setOnClickListener{
                val extras = Bundle()
                extras.putString("NamaFilm", nama1.text.toString())
                extras.putString("RateFilm", rate1.text.toString())
                extras.putString("DirectorFilm", "Ghifari1")
                extras.putString("StoryFilm", "Halo ini film 1")
                intentToThirdActivity.putExtras(extras)
                startActivity(intentToThirdActivity)
            }
            poster2.setOnClickListener{
                val extras = Bundle()
                extras.putString("NamaFilm", nama2.text.toString())
                extras.putString("RateFilm", rate2.text.toString())
                extras.putString("DirectorFilm", "Ghifari2")
                extras.putString("StoryFilm", "Halo ini film 2")
                intentToThirdActivity.putExtras(extras)
                startActivity(intentToThirdActivity)
            }
            poster3.setOnClickListener{
                val extras = Bundle()
                extras.putString("NamaFilm", nama3.text.toString())
                extras.putString("RateFilm", rate3.text.toString())
                extras.putString("DirectorFilm", "Ghifari3")
                extras.putString("StoryFilm", "Halo ini film 3")
                intentToThirdActivity.putExtras(extras)
                startActivity(intentToThirdActivity)
            }
            poster4.setOnClickListener{
                val extras = Bundle()
                extras.putString("NamaFilm", nama4.text.toString())
                extras.putString("RateFilm", rate4.text.toString())
                extras.putString("DirectorFilm", "Ghifari4")
                extras.putString("StoryFilm", "Halo ini film 4")
                intentToThirdActivity.putExtras(extras)
                startActivity(intentToThirdActivity)
            }
            poster5.setOnClickListener{
                val extras = Bundle()
                extras.putString("NamaFilm", nama5.text.toString())
                extras.putString("RateFilm", rate5.text.toString())
                extras.putString("DirectorFilm", "Ghifari5")
                extras.putString("StoryFilm", "Halo ini film 5")
                intentToThirdActivity.putExtras(extras)
                startActivity(intentToThirdActivity)
            }
            poster6.setOnClickListener{
                val extras = Bundle()
                extras.putString("NamaFilm", nama6.text.toString())
                extras.putString("RateFilm", rate6.text.toString())
                extras.putString("DirectorFilm", "Ghifari6")
                extras.putString("StoryFilm", "Halo ini film 6")
                intentToThirdActivity.putExtras(extras)
                startActivity(intentToThirdActivity)
            }
        }
    }
}