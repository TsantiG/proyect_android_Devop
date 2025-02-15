package com.co.apps.depov.peronalSegurity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainHomeUser : AppCompatActivity() {
    private lateinit var btnmessage: TextView
    private lateinit var  btnperfil: ImageView
    private lateinit var btnconfig: ImageView
    private lateinit var btnaccesibility: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_home_user)

        viewsInit()
        btnHome()

    }

    fun viewsInit(){
        btnmessage = findViewById(R.id.message_pluss)
        btnperfil = findViewById(R.id.img_user_menu)
        btnconfig = findViewById(R.id.img_conf_user_menu)
        btnaccesibility = findViewById(R.id.img_info_user_menu)

    }
    fun btnHome(){
        btnmessage.setOnClickListener {
            val intent = Intent(this, MainHomeUser::class.java)
            startActivity(intent)
        }
        btnperfil.setOnClickListener {
            val intent = Intent(this, MainUserPerfil::class.java)
            startActivity(intent)
        }
        btnconfig.setOnClickListener {
            val intent = Intent(this, MainConf::class.java)
            startActivity(intent)
        }
        btnaccesibility.setOnClickListener {
            val intent = Intent(this, MainAccesibilityOptions::class.java)
            startActivity(intent)
        }


    }
}