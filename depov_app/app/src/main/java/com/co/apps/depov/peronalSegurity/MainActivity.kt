package com.co.apps.depov.peronalSegurity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btnregister: Button
    private lateinit var btnlogin: Button
    private lateinit var btnfacebook: ImageView
    private lateinit var btntwitter: ImageView
    private lateinit var btninstagram: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewsInit()
        btnHome()
        btnRedes()

    }

    fun viewsInit(){
        btnregister = findViewById(R.id.btn_register_home)
        btnlogin = findViewById(R.id.btn_login_home)
        btnfacebook = findViewById(R.id.img_facebook_home)
        btntwitter = findViewById(R.id.img_twitter_home)
        btninstagram = findViewById(R.id.img_instagram_home)
    }

    fun btnHome(){
        btnregister.setOnClickListener {
            val intent = Intent(this, MainRegister::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            val intent = Intent(this, MainLogin::class.java)
            startActivity(intent)
        }
    }

    fun btnRedes(){
        btnfacebook.setOnClickListener {
            val url = "https://www.facebook.com/depov.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        btntwitter.setOnClickListener {
            val url = "https://twitter.com/depov_com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        btninstagram.setOnClickListener {
            val url = "https://www.instagram.com/depov.com"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }
    }


}