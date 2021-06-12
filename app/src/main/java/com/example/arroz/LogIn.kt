package com.example.arroz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class LogIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        var btnSig =findViewById<ImageButton>(R.id.btnSig)
        btnSig.setOnClickListener { startActivity(Intent(this, Tabs::class.java)) }


    }
}