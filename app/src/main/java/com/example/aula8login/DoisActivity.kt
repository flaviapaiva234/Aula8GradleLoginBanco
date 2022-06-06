package com.example.aula8login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula8login.databinding.ActivityDoisBinding
import com.example.aula8login.databinding.ActivityTresBinding

class DoisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDoisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDoisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.brtCancelarCadastro.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        binding.brtSalvar.setOnClickListener {
            val nome = binding.etCadastrarNome.text.toString()
            val email2 = binding.etCadastrarEmail2.text.toString()
            val senha2 = binding.etCadastrarSenha2.text.toString()
            val cidade = binding.etCidade.text.toString()
            val pais = binding.etPais.text.toString()

            Intent(this, QuatroActivity::class.java).also {
                val bundle = Bundle()
                with(bundle) {
                    putString("EXTRA_NOME", nome)
                    putString("EXTRA_EMAIL2", email2)
                    putString("EXTRA_SENHA2", senha2)
                    putString("EXTRA_CIDADE", cidade)
                    putString("EXTRA_PAIS", pais)
                    it.putExtras(bundle)
                }
                startActivity(it)
            }


        }
    }
}