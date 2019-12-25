package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class employeesignup2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeesignup2)

        val employeesignup1 : Button = findViewById(R.id.signup1)
        employeesignup1.setOnClickListener {
            val intent = Intent(this, employeesignup3::class.java)
            startActivity(intent)
        }
    }


}
