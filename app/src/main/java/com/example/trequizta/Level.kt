package com.example.trequizta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.trequizta.databinding.ActivityLevelBinding
import com.example.trequizta.databinding.ActivityMainBinding

class Level : AppCompatActivity() {

    private lateinit var binding: ActivityLevelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLevelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userName = intent.getStringExtra(UserVariables.USER_NAME)
        binding.pName.text = userName

        binding.backarrow.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}