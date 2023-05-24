package com.example.halamanlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.halamanlogin.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        binding = ActivityMain2Binding.inflate(layoutInflater)

        val nama = intent.getStringExtra("nama")
        binding.tvNama.text = nama.toString()
        val email = intent.getStringExtra("email")
        binding.tvEmail.text = email.toString()
        val alamat = intent.getStringExtra("alamat")
        binding.tvAlamat.text = alamat.toString()
        val noHp = intent.getStringExtra("no Hp")
        binding.tvHape.text = noHp.toString()
        setContentView(binding.root)

    }
}