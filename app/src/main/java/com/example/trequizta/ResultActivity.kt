package com.example.trequizta

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.trequizta.databinding.ActivityResultBinding


class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_result)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        }

        val rightAnswers = intent.getIntExtra(UserVariables.RIGHT_ANSWERS, 0)
        val username = intent.getStringExtra(UserVariables.USER_NAME)
        val questionSize = intent.getIntExtra(UserVariables.QUESTION_SIZE, 0)

        binding.username = username
        binding.score = rightAnswers
        binding.size = questionSize

        binding.btnFinish.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}