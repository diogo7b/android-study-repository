package com.example.conversor_moeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversor_moeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendButton.setOnClickListener {
            val real = binding.insertValue.text.toString().toDouble()
            val euros = String.format("%.2f", real * 5.55)
            val dolar = String.format("%.2f", real * 5.05)

            binding.tvEuro.text = euros.toString()
            binding.tvDolar.text = dolar.toString()
        }
    }
}