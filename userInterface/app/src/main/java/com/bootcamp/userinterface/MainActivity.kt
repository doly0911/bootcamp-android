package com.bootcamp.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnRegister: Button
    private lateinit var btnIngresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister= findViewById(R.id.btn_registrarse)
        btnIngresar= findViewById(R.id.btn_ingresar)

        btnRegister.setOnClickListener {
            val intent = Intent(this, RegisterUserActivity::class.java)
            startActivity(intent)
        }
        btnIngresar.setOnClickListener {
            val intent = Intent(this, TaskActivity::class.java)
            startActivity(intent)
        }
    }
}