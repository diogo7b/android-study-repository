package com.example.credential

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.credential.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEntrar.setOnClickListener {
            val username = binding.editUsername.text.toString().trim()
            val password = binding.editPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Preencha todas as credenciais",
                    Toast.LENGTH_SHORT
                ).show()
            }

            if (username.equals("user") && password.equals("pass")) {
                Toast.makeText(
                    applicationContext,
                    "Acesso liberado",
                    Toast.LENGTH_SHORT
                ).show()
                cleanCredential()
                startActivity(Intent(this, InitialPageActivity::class.java))
            } else {
                Toast.makeText(
                    applicationContext,
                    "Credenciais incorretas",
                    Toast.LENGTH_SHORT
                ).show()
                cleanCredential()
            }
        }

    }
    private fun cleanCredential() {
        binding.editUsername.setText("")
        binding.editPassword.setText("")
    }
}