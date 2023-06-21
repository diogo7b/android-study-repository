package com.example.primeiroapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.primeiroapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnName.setOnClickListener {
            val nome: String = binding.textTextName.text.toString()
            // Examples
            // binding.textViewName.text = "Olá" + nome
            // binding.textViewName.setText("Olá ${nome}")
            binding.textViewName.text = "Olá ${nome}"
        }
    }
}