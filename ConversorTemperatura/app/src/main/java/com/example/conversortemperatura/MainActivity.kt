package com.example.conversortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversortemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConverter.setOnClickListener {
            if (!binding.editTemperatura.text.toString().isEmpty()) {
                binding.btnConverter.setOnClickListener {
                    val celsius = binding.editTemperatura.text.toString().toDouble()
                    val fahrenheit = String.format("%.2f", celsius * 1.8 + 32)

                    binding.txtTempF.text = "$fahrenheit °F"
                }
            } else {
                binding.txtTempF.text = "Temperatura inválida"

            }
        }


    }
}