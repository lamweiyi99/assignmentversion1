package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class employeesignup4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeesignup4)

        val employeesignup3 : ImageButton = findViewById(R.id.signupback3)
        employeesignup3.setOnClickListener {
            onBackPressed()
        }



    }
}

