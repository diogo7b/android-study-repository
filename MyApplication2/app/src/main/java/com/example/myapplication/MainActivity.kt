package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNumber1.setOnClickListener {
            val numero1 = binding.edtNumber1.text.toString().trim().toInt()

            val i = Intent(this, MainActivity2::class.java)
            i.putExtra("numero1", numero1)
            startActivity(i)

        }
    }
}