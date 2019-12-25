package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class employeesignup3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeesignup3)

        val employeesignup2 : Button = findViewById(R.id.signup2)
        employeesignup2.setOnClickListener {
            val intent = Intent(this, employeesignup4::class.java)
            startActivity(intent)
        }
    }
}
