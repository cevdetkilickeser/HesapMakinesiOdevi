package com.cevdetkilickeser.hesapmakinesiodevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.cevdetkilickeser.hesapmakinesiodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var sonuc = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textViewSonuc.text = sonuc

        binding.button0.setOnClickListener {
            sonuc += "0"
            binding.textViewSonuc.text = sonuc
        }

        binding.button1.setOnClickListener {
            sonuc += "1"
            binding.textViewSonuc.text = sonuc
        }

        binding.button2.setOnClickListener {
            sonuc += "2"
            binding.textViewSonuc.text = sonuc
        }

        binding.button3.setOnClickListener {
            sonuc += "3"
            binding.textViewSonuc.text = sonuc
        }

        binding.button4.setOnClickListener {
            sonuc += "4"
            binding.textViewSonuc.text = sonuc
        }

        binding.button5.setOnClickListener {
            sonuc += "5"
            binding.textViewSonuc.text = sonuc
        }

        binding.button6.setOnClickListener {
            sonuc += "6"
            binding.textViewSonuc.text = sonuc
        }

        binding.button7.setOnClickListener {
            sonuc += "7"
            binding.textViewSonuc.text = sonuc
        }

        binding.button8.setOnClickListener {
            sonuc += "8"
            binding.textViewSonuc.text = sonuc
        }

        binding.button9.setOnClickListener {
            sonuc += "9"
            binding.textViewSonuc.text = sonuc
        }

        binding.buttonArti.setOnClickListener {
            sonuc += "+"
            binding.textViewSonuc.text = sonuc
        }

        binding.buttonSil.setOnClickListener {
            if (sonuc != ""){
                sonuc = sonuc.dropLast(1)
                binding.textViewSonuc.text = sonuc
            }
        }

        binding.buttonTemizle.setOnClickListener {
            sonuc = ""
            binding.textViewSonuc.text = sonuc
        }

        binding.buttonEsittir.setOnClickListener {
            var toplam = 0
            var sonucList = sonuc.split("+").toTypedArray()
            for (i in sonucList){
                toplam += i.toInt()
            }
            binding.textViewSonuc.text = toplam.toString()
            sonuc = ""
        }
    }
}