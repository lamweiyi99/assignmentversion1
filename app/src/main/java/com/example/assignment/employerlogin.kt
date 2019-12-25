package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class employerlogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employerlogin)

        val employerforgetpassword : Button = findViewById(R.id.employerforgetpass)
        employerforgetpassword.setOnClickListener {
            val intent = Intent(this, forgotpassword::class.java)
            startActivity(intent)
        }


        val employersign: Button = findViewById(R.id.employercreate)
        employersign.setOnClickListener {
            val intent = Intent(this, employersignup::class.java)
            startActivity(intent)
        }
    }
}
