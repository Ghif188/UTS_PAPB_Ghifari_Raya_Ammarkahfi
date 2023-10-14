package com.example.utspapb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.utspapb.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding : ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        val namaFilm = intent.extras?.getString("NamaFilm")
        val rateFilm = intent.extras?.getString("RateFilm")
        val directorFilm = intent.extras?.getString("DirectorFilm")
        val storyFilm = intent.extras?.getString("StoryFilm")

        setContentView(binding.root)
        val kursi = arrayOf(
            "Reguler",
            "VIP",
        )
        val bioskop = arrayOf(
            "CGV",
            "XXI",
            "Lk21",
            "Dirumah",
        )
        val metode = arrayOf(
            "Transfer",
            "Qris",
            "Mobile banking",
            "COD",
        )
        val bank = arrayOf(
            "BNI",
            "BRI",
            "Mandiri",
            "BSI",
        )
        with(binding){
            val kursiAdapter = ArrayAdapter(this@MainActivity4,
                android.R.layout.simple_spinner_dropdown_item,
                kursi)
            kursiAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerSeat.adapter = kursiAdapter
            val bioskopAdapter = ArrayAdapter(this@MainActivity4,
                android.R.layout.simple_spinner_dropdown_item,
                bioskop)
            if (spinnerSeat.selectedItem.toString() == "Reguler"){
                seatTeks.text = "Reguler"
                hargaAwalTeks.text = "Rp. 35.000"
                totalHargaTeks.text = "Rp. 35.000"
            } else if (spinnerSeat.selectedItem.toString() == "VIP"){
                seatTeks.text = "VIP"
                hargaAwalTeks.text = "Rp. 50.000"
                totalHargaTeks.text = "Rp. 50.000"
            }
            var tanggal = ""
            bioskopAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerBioskop.adapter = bioskopAdapter
            val methodAdapter = ArrayAdapter(this@MainActivity4,
                android.R.layout.simple_spinner_dropdown_item,
                metode)
            methodAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerMethod.adapter = methodAdapter
            val bankAdapter = ArrayAdapter(this@MainActivity4,
                android.R.layout.simple_spinner_dropdown_item,
                bank)
            bankAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerBank.adapter = bankAdapter
            datePicker.init(datePicker.year, datePicker.month, datePicker.dayOfMonth)
            { _, year, monthOfYear, dayOfMonth ->
                tanggal = "$dayOfMonth/${monthOfYear + 1}/$year"
            }
            spinnerSeat?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onNothingSelected(parent: AdapterView<*>?) {

                }
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    val selectedItem = parent?.getItemAtPosition(position).toString()
                    if (selectedItem == "Reguler") {
                        seatTeks.text = "Reguler"
                        hargaAwalTeks.text = "Rp. 35.000"
                        totalHargaTeks.text = "Rp. 35.000"
                    } else if (selectedItem == "VIP"){
                        seatTeks.text = "VIP"
                        hargaAwalTeks.text = "Rp. 50.000"
                        totalHargaTeks.text = "Rp. 50.000"
                    }
                }

            }
            val intentToFifthActivity = Intent(this@MainActivity4, MainActivity5::class.java)
            val extras = Bundle()
            btnSummary.setOnClickListener{
                extras.putString("NamaFilm", namaFilm)
                extras.putString("RateFilm", rateFilm)
                extras.putString("DirectorFilm", directorFilm)
                extras.putString("StoryFilm", storyFilm)
                extras.putString("Tanggal", tanggal)
                extras.putString("Lokasi", spinnerBioskop.selectedItem.toString())
                extras.putString("JenisSeat", spinnerSeat.selectedItem.toString())
                extras.putString("TotalHarga", totalHargaTeks.text.toString())
                extras.putString("MethodBayar", spinnerMethod.selectedItem.toString() + " (" + spinnerBank.selectedItem + ")")
                intentToFifthActivity.putExtras(extras)
                startActivity(intentToFifthActivity)
            }
        }
    }
}