package com.example.a04_convermoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a04_convermoeda.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit private var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConvDolar.setOnClickListener {
            converterValor(0.8)
        }

        binding.btnConvReal.setOnClickListener {
            converterValor(5.5)
        }

        binding.btnConvIenes.setOnClickListener {
            converterValor(148.6)
        }

    }

    private fun converterValor(taxa: Double) {
        val valor = binding.editValor.text.toString().trim()

        if (!valor.isEmpty()) {
            val resultado = String.format("%.3f", valor.toDouble() * taxa)
            binding.txtMostrarValor.setText("$resultado")
            Toast.makeText(applicationContext, "$resultado", Toast.LENGTH_SHORT).show()
        } else {
            binding.txtMostrarValor.setText("Digite um valor!")
        }
    }
}