package com.example.trequizta

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.trequizta.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userDiffLevel = intent.getStringExtra(UserVariables.DIFF_LEVEL)

        //Log.i("User Level is:", "$userDiffLevel")
        Log.i("Questions are: ", "${UserVariables.getQuestions(userDiffLevel.toString())}")

        val userQuestionList = UserVariables.getQuestions(userDiffLevel.toString())


    }
}