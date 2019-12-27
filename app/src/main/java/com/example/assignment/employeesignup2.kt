package com.example.assignment

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.OnBackPressedCallback

class employeesignup2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeesignup2)

        val signup1 : Button = findViewById(R.id.signup1)
        signup1.setOnClickListener {
            val intent = Intent(this, employeesignup3::class.java)
            startActivity(intent)
        }

        val employeesignup1 : ImageButton = findViewById(R.id.signupback1)
        employeesignup1.setOnClickListener {
           onBackPressed()
        }
    }


}
