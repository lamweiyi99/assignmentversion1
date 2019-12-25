package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class employeelogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employeelogin)


        val employeecreate : Button = findViewById(R.id.employeecreate)
        employeecreate.setOnClickListener {
            val intent = Intent(this, employeesignup1::class.java)
            startActivity(intent)
        }


        val employeeforgetpassword : Button = findViewById(R.id.employeeforgetpass)
        employeeforgetpassword.setOnClickListener {
            val intent = Intent(this, forgotpassword::class.java)
            startActivity(intent)
        }

    }

}
