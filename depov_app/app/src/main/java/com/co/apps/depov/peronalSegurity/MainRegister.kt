package com.co.apps.depov.peronalSegurity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainRegister : AppCompatActivity() {
    private lateinit var btnbackhome: ImageView
    private lateinit var btncreateuser: Button
    private lateinit var et_Email: TextInputEditText
    private lateinit var et_pass: TextInputEditText
    private lateinit var emailInputLayout: TextInputLayout
    private lateinit var passwordInputLayout: TextInputLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_register)

        viewsInit()

    }

    fun viewsInit(){
        btnbackhome = findViewById(R.id.img_atras_register)
        btncreateuser = findViewById(R.id.btn_register)
        et_Email = findViewById(R.id.tie_register_email)
        et_pass = findViewById(R.id.tie_register_pass)
        emailInputLayout = findViewById(R.id.til_register_email)
        passwordInputLayout = findViewById(R.id.til_register_pass)

    }

    fun register(){
        btncreateuser.setOnClickListener {
            val email = et_Email.text.toString().trim()
            val password = et_pass.text.toString().trim()

            if (email.isEmpty()) {
                emailInputLayout.error = "El correo electrónico es obligatorio"
                return@setOnClickListener
            } else {
                emailInputLayout.error = null
            }

            if (password.isEmpty()) {
                passwordInputLayout.error = "La contraseña es obligatoria"
                return@setOnClickListener
            } else {
                passwordInputLayout.error = null
            }
        }

        btnbackhome.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

