package com.example.multyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multyactivity.databinding.ActivityMainBinding
import com.example.multyactivity.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySegundaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.button.setOnClickListener{
            // Se usar desta forma irá criar instancias continuamente.
            //startActivity(Intent(this, ActivityMainBinding::class.java))

            //método ideal nesse caso
            finish()

        }


    }
}