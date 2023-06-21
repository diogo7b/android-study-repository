package com.example.menurestaurante

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menurestaurante.databinding.ActivityDadosPedidoBinding

class DadosPedidoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDadosPedidoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDadosPedidoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val i = intent
        val qtdCafe = i.getStringExtra("qtd_cafe").toString().toInt()
        val qtdPao = i.getStringExtra("qtd_pao").toString().toInt()
        val qtdChoc = i.getStringExtra("qtd_choco").toString().toInt()
        val precoCafe = i.getDoubleExtra("preco_cafe", 0.0)
        val precoPao = i.getDoubleExtra("preco_pao", 0.0)
        val precoChoc = i.getDoubleExtra("preco_choc", 0.0)

        val texto = "Resumo do Pedido: \n" +
                "Café: $qtdCafe, Preço: ${qtdCafe * precoCafe} £ \n" +
                "Pão: $qtdPao, Preço: ${qtdPao * precoPao} £ \n" +
                "Chocolate: $qtdChoc, Preço: ${qtdChoc * precoChoc} £ \n"
    }
}