package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class employeesignup3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeesignup3)

        val signup2 : Button = findViewById(R.id.signup2)
        signup2.setOnClickListener {
            val intent = Intent(this, employeesignup4::class.java)
            startActivity(intent)
        }

        val employeesignup2 : ImageButton = findViewById(R.id.signupback2)
        employeesignup2.setOnClickListener {
            onBackPressed()
        }
    }
}
