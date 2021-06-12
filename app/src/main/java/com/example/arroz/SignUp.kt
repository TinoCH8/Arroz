package com.example.arroz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        var btnSig2 =findViewById<ImageButton>(R.id.btnSig2)
        btnSig2.setOnClickListener { startActivity(Intent(this, Tabs::class.java)) }


    }
}
