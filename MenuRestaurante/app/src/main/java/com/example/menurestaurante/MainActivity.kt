package com.example.menurestaurante

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menurestaurante.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        val precoCafe = 1.0
        val precoPao = 0.25
        val precoChoc = 3.0

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPedido.setOnClickListener {
            val i = Intent(this, SplashScreenActivity::class.java)
            i.putExtra("qtd_cafe", binding.editQtdCafe.toString().toDouble())
            i.putExtra("qtd_pao", binding.editQtdPao.toString().toDouble())
            i.putExtra("qtd_choc", binding.editQtdChoc.toString().toDouble())
            i.putExtra("preco_cafe", precoCafe)
            i.putExtra("preco_pao", precoPao)
            i.putExtra("preco_choc", precoChoc)
            startActivity(i)
        }

        binding.checkCafe.setOnClickListener {
            if (binding.checkCafe.isChecked()) {
                binding.editQtdCafe.setText("1")
            } else {
                binding.editQtdCafe.setText("0")
            }
        }

        binding.checkPao.setOnClickListener {
            if (binding.checkPao.isChecked()) {
                binding.editQtdPao.setText("1")
            } else {
                binding.editQtdPao.setText("0")
            }
        }

        binding.checkChoc.setOnClickListener {
            if (binding.checkChoc.isChecked()) {
                binding.editQtdChoc.setText("1")
            } else {
                binding.editQtdChoc.setText("0")
            }
        }
    }
}