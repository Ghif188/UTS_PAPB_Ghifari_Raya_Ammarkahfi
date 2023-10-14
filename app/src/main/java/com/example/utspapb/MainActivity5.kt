package com.example.utspapb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.utspapb.databinding.ActivityMain4Binding
import com.example.utspapb.databinding.ActivityMain5Binding

class MainActivity5 : AppCompatActivity() {
    private lateinit var binding: ActivityMain5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain5Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val namaFilm = intent.extras?.getString("NamaFilm")
        val rateFilm = intent.extras?.getString("RateFilm")
        val directorFilm = intent.extras?.getString("DirectorFilm")
        val jenisSeatInput = intent.extras?.getString("JenisSeat")
        val tanggalInput = intent.extras?.getString("Tanggal")
        val metodeBayarInput = intent.extras?.getString("MethodBayar")
        val totalHargaInput = intent.extras?.getString("TotalHarga")
        val lokasiInput = intent.extras?.getString("Lokasi")
        with(binding){
            judul.text = namaFilm
            lokasi.text = lokasiInput
            tanggal.text = tanggalInput
            metodeBayar.text = metodeBayarInput
            jenisSeat.text = jenisSeatInput
            totalHarga.text = totalHargaInput
            totalHarga2.text = totalHargaInput
        }
    }
}