package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val bundle = i.extras

        binding.btnNumber2.setOnClickListener {
            val numero2 = binding.edtNumber2.text.toString().trim().toInt()

            val i = Intent(this, MainActivity3::class.java)
            //Necessário realizar sempre o nullcheck do bundle
            if (bundle != null) {
                i.putExtras(bundle)
            }
            i.putExtra("numero2", numero2)
            startActivity(i)
        }
    }
}