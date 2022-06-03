package com.example.aula8login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula8login.databinding.ActivityTresBinding

class TresActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTresBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTresBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.brtConfirmarLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val senha = binding.etSenha.text.toString()

            Intent(this, QuatroActivity::class.java).also {
                val bundle = Bundle()
                it.putExtra("EXTRA_EMAIL", email)
                it.putExtra("EXTRA_SENHA", senha)
                startActivity(it)
            }
        }

        binding.brtCancelarLogin.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}