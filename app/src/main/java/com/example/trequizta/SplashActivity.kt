package com.example.trequizta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.trequizta.MainActivity
import com.example.trequizta.R


class SplashActivity : AppCompatActivity() {

    private val splashTimeOut :Long = 3000 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        Handler(Looper.getMainLooper()).postDelayed({


            startActivity(Intent(this, MainActivity::class.java))

            // close this activity
            finish()
        }, splashTimeOut)
    }
}