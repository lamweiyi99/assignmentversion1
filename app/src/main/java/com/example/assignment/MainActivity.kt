package com.example.assignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main1 : Button = this.findViewById(R.id.button4)
        main1.setOnClickListener{
            val intent = Intent(this, selections::class.java )
            startActivity(intent)
        }



    }




}
