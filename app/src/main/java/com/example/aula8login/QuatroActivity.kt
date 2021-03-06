package com.example.aula8login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.aula8login.databinding.ActivityDoisBinding
import com.example.aula8login.databinding.ActivityQuatroBinding

class QuatroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuatroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuatroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.brtVoltarInicio.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }

        val email = intent.getStringExtra("EXTRA_EMAIL")
        val senha = intent.getStringExtra("EXTRA_SENHA")
        val loginString1 = "Bem vindo novamente $email ." +
                "Sua senha $senha continua a mesma!"
        binding.resposta1.text = loginString1

        val extras = intent.extras
        val incomingNome = extras?.getString("EXTRA_NOME")
        val incomingEmail2 = extras?.getString("EXTRA_EMAIL2")
        val incomingSenha2 = extras?.getString("EXTRA_SENHA2")
        val incomingCidade = extras?.getString("EXTRA_CIDADE")
        val incomingPais = extras?.getString("EXTRA_PAIS")


        if (
            incomingNome == null &&
            incomingEmail2 == null &&
            incomingSenha2 == null &&
            incomingCidade == null &&
            incomingPais == null

        ) {
            binding.resposta2.visibility = View.GONE
        } else {
            val cadastroString2 =
                " Oi $incomingNome seu E-mail $incomingEmail2 e senha $incomingSenha2 foram cadastrados com Sucesso! Bem vindo(a) ao banco na sua cidade $incomingCidade e pais $incomingPais"
            binding.resposta2.text = cadastroString2
            binding.resposta1.visibility = View.GONE
        }
    }
}