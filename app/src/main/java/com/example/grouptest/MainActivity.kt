package com.example.grouptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var clickMe: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickMe = findViewById(R.id.bntClickMe)

        clickMe.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        }
    }
}