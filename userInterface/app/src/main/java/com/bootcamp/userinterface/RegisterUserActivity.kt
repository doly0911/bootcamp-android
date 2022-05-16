package com.bootcamp.userinterface

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class RegisterUserActivity : AppCompatActivity() {
    private lateinit var btnCancel: Button
    private lateinit var btnAcept: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)

        btnAcept = findViewById(R.id.btnAceptar)
        btnCancel = findViewById(R.id.btnCancelar)

        btnAcept.setOnClickListener {
            Toast.makeText(this, "Usuario Creado Exitosamente", Toast.LENGTH_SHORT).show()
        }

        btnCancel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}