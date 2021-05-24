package com.example.trequizta
/*
This stores all the necessary attributes for a question sample,
and the QuestionBankActivity will take its variables from here including user choice of difficulty level.
*/
data class Question(
    val id: Int,
    val level: String,
    val question: String,
    val op1: String,
    val op2: String,
    val op3: String,
    val op4: String,
    val rightAns: Int
)

