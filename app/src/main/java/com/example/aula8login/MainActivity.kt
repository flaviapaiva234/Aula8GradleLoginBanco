package com.example.aula8login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.aula8login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.brtLogin.setOnClickListener {
           Intent(this, TresActivity::class.java).also{
               startActivity(it)
        }

}

        binding.brtCadastro.setOnClickListener {
            Intent(this, DoisActivity::class.java).also{
                startActivity(it)
            }
        }
    }
}