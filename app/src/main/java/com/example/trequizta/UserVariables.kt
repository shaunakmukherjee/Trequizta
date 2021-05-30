package com.example.trequizta

import android.util.Log

/*
* Particular user constant variables which will be used to display continuing data.
* */
object UserVariables{

    //the following variables are declared for usage in Intent, .i.e. binding data between screens
    const val USER_NAME: String = "user_name"
    const val DIFF_LEVEL: String = "diff_level"
    const val RIGHT_ANSWERS: String = "no_of_right_answers"
    const val QUESTION_SIZE: String = "question_size"

     fun getQuestions(userLevel: String): List <Question> {

         val questionList  = ArrayList<Question>()

         val q1 = Question(
             id = 1,
             level = "E",
             question = "Q1-E",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )
         val q2 = Question(
             id = 2,
             level = "M",
             question = "Q1-M",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )

         val q3 = Question(
             id = 3,
             level = "H",
             question = "Q1-H",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )

         val q4 = Question(
             id = 4,
             level = "E",
             question = "Q2-E",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )

         val q5 = Question(
             id = 5,
             level = "M",
             question = "Q2-M",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )

         val q6 = Question(
             id = 6,
             level = "H",
             question = "Q1-H",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )

         val q7 = Question(
             id = 7,
             level = "E",
             question = "Q3-E",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )
         val q8 = Question(
             id = 8,
             level = "M",
             question = "Q3-M",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )
         val q9 = Question(
             id = 9,
             level = "H",
             question = "Q3-H",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )
         val q10 = Question(
             id = 10,
             level = "E",
             question = "Q4-E",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )
         val q11 = Question(
             id = 11,
             level = "M",
             question = "Q4-M",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )
         val q12 = Question(
             id = 12,
             level = "H",
             question = "Q4-H",
             op1 = "A1",
             op2 = "A2",
             op3 = "A3",
             op4 = "A4",
             rightAns = 2
         )


        questionList.addAll(listOf(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12))

        val userQuestionList = questionList.filter { it.level == userLevel }

         Log.i("List of questions", "$userQuestionList")

         return userQuestionList
     }

}