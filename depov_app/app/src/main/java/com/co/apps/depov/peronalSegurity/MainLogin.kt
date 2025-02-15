package com.co.apps.depov.peronalSegurity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainLogin: AppCompatActivity() {
    private lateinit var btnbackhome: ImageView
    private lateinit var btnregister: TextView
    private lateinit var btnlogin: Button
    private lateinit var et_Email: TextInputEditText
    private lateinit var et_pass: TextInputEditText
    private lateinit var emailInputLayout: TextInputLayout
    private lateinit var passwordInputLayout: TextInputLayout


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        viewsInit()
        login()

    }

    fun viewsInit(){
        btnbackhome = findViewById(R.id.img_atras_login)
        btnregister = findViewById(R.id.text_enlace_login_register)
        btnlogin = findViewById(R.id.btn_login)
        et_Email = findViewById(R.id.tie_login_email)
        et_pass = findViewById(R.id.tie_login_pass)
        emailInputLayout = findViewById(R.id.til_login_email)
        passwordInputLayout = findViewById(R.id.til_login_pass)

    }

    fun login(){
        btnlogin.setOnClickListener {
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

        btnregister.setOnClickListener {
            val intent = Intent(this, MainRegister::class.java)
            startActivity(intent)
        }
    }
}