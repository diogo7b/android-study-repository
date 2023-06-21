package com.example.multyactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multyactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIr.setOnClickListener{
            /*val i = Intent(this, SegundaActivity::class.java)
            startActivity(i)*/

            startActivity(Intent(this, SegundaActivity::class.java))
        }
    }
}