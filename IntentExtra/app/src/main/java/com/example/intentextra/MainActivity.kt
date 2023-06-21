package com.example.intentextra

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import com.example.intentextra.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnAcessar.setOnClickListener {
            val nome = binding.edtNome.text.toString()

            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("nome", nome)
            startActivity(i)
        }
    }


}
