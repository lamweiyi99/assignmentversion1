package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class employeesignup1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeesignup1)
        val employeesignup: Button = findViewById(R.id.employeesignup)
        employeesignup.setOnClickListener{
            val intent = Intent(this, employeesignup2::class.java)
            startActivity(intent)
        }
    }
    }



