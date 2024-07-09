package com.example.grouptest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //this screen would act like a delay screen for the app and redirect to the Sign Up
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
        //a proper "Mugged" wallpaper/Screen / Logo needs to be created as well as the CSS fr the app and web


    }
}