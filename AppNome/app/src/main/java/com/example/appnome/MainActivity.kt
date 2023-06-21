package com.example.appnome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.appnome.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit private var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener{
            val nome = binding.editNome.text.toString().trim()
            val snome = binding.editSobrenome.text.toString().trim()

            if(nome.isEmpty() || snome.isEmpty()) {
                binding.textBoasvindas.text = "Insira todos os dados!"
                Toast.makeText(applicationContext, "Insira todos os dados!", Toast.LENGTH_SHORT).show()
            } else {
                binding.textBoasvindas.text = "Olá $nome $snome"
                Toast.makeText(applicationContext, "Olá $nome $snome", Toast.LENGTH_LONG).show()
            }
        }
    }
}