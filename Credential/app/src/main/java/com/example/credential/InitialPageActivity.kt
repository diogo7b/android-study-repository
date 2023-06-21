package com.example.credential

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.credential.databinding.ActivityInitialPageBinding

class InitialPageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInitialPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInitialPageBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnVoltar.setOnClickListener{
            finish()
        }
    }
}