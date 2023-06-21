package com.example.crudsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.crudsimple.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var pos = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaUtilizador = ArrayList<Utilizador>()

        listaUtilizador.add(Utilizador("user", "user"))
        listaUtilizador.add(Utilizador("admin", "admin"))
        listaUtilizador.add(Utilizador("commom", "123"))

        val adapterLU = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaUtilizador)
        binding.listViewUtilizador.adapter = adapterLU

        binding.listViewUtilizador.setOnItemClickListener { parent, view, position, id ->
            binding.edtUsername.setText(listaUtilizador.get(position).username)
            binding.edtPassword.setText(listaUtilizador.get(position).password)
            pos = position
        }

        binding.btnAdicionar.setOnClickListener {
            val username = binding.edtUsername.text.toString().trim()
            val password = binding.edtPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(applicationContext, "Preencha todos os campos", Toast.LENGTH_SHORT)
                    .show()
            }

            if (!username.isEmpty() && !password.isEmpty()) {
                listaUtilizador.add(Utilizador(username, password))
                adapterLU.notifyDataSetChanged()
                pos = -1
            }

            binding.edtUsername.setText("")
            binding.edtPassword.setText("")
        }

        binding.btnEditar.setOnClickListener {
            val username = binding.edtUsername.text.toString().trim()
            val password = binding.edtPassword.text.toString().trim()
            if (!username.isEmpty() && !password.isEmpty()) {
                listaUtilizador.get(pos).username = username
                listaUtilizador.get(pos).password = password
                binding.edtUsername.setText("")
                binding.edtPassword.setText("")
                pos = -1
            }
        }

        binding.btnExcluir.setOnClickListener {
            if (pos >= 0) {
                listaUtilizador.removeAt(pos)
                adapterLU.notifyDataSetChanged()
                binding.edtUsername.setText("")
                binding.edtPassword.setText("")
                pos = -1
            }
        }
    }
}