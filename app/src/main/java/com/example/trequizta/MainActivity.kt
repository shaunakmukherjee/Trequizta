package com.example.trequizta
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trequizta.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    //since findViewByID is deprecated, we make use of view bindings
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //since SystemUIVisibility has deprecated
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        }

        binding.btnPlay.setOnClickListener {
            startActivity(Intent(this, SplashActivity::class.java))

        }
    }
}