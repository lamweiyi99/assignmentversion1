package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class selections : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selections)

        val employee : Button = findViewById(R.id.employee)
        employee.setOnClickListener{
            val intent = Intent(this, employeelogin::class.java )
            startActivity(intent)
        }

        val employer : Button = findViewById(R.id.employer)
        employer.setOnClickListener{
            val intent = Intent(this, employerlogin::class.java )
            startActivity(intent)
        }
    }


}
