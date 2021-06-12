package com.example.arroz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnLogin =findViewById<ImageButton>(R.id.btnLogin)
        var btnSignUp =findViewById<ImageButton>(R.id.btnSingUp)


        btnLogin.setOnClickListener { startActivity(Intent(this, LogIn::class.java)) }
        btnSignUp.setOnClickListener { startActivity(Intent(this, SignUp::class.java)) }



    }
}