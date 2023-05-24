package com.example.halamanlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.halamanlogin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnKirim.setOnClickListener(){
            sendMassage()
        }
        setContentView(binding.root)
    }
    fun sendMassage(){
        val nama = binding.etnama.text.toString()
        val email = binding.etEmail.text.toString()
        val alamat = binding.etAlamat.text.toString()
        val noHp = binding.etHp.text.toString()

        val intent = Intent(this,MainActivity2::class.java)

        intent.putExtra("nama",nama)
        intent.putExtra("email",email)
        intent.putExtra("alamat",alamat)
        intent.putExtra("no Hp",noHp)

        startActivity(intent)
    }
}