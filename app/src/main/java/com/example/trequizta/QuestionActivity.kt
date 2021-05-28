package com.example.trequizta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.example.trequizta.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityQuestionBinding = DataBindingUtil.setContentView(this, R.layout.activity_question)

        val userDiffLevel = intent.getStringExtra(UserVariables.DIFF_LEVEL)

        //Log.i("User Level is:", "$userDiffLevel")
        Log.i("Questions are: ", "${UserVariables.getQuestions(userDiffLevel.toString())}")

        binding.backArrow.setOnClickListener{
            startActivity(Intent(this, Level::class.java))
        }

        val userQuestionList = UserVariables.getQuestions(userDiffLevel.toString())

        val currentQuestion = 1
        binding.questionBar.progress = currentQuestion

        val question: Question = userQuestionList[currentQuestion - 1]

        Log.i("First question is: ", question.question)

        binding.questionBody = question.question

        binding.option1 = question.op1
        binding.option2 = question.op2
        binding.option3 = question.op3
        binding.option4 = question.op4

    }
}