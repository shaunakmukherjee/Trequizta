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
             question = "Which English club has won the most Premier Leagues in history?",
             op1 = "Chelsea",
             op2 = "Manchester United",
             op3 = "Arsenal",
             op4 = "Liverpool",
             rightAns = 2
         )
         val q2 = Question(
             id = 2,
             level = "M",
             question = "I recently broke Gerd Muller's record for most goals in a single Bundesliga season (40). Who am I? ",
             op1 = "Thomas Muller",
             op2 = "Marco Reus",
             op3 = "Robert Lewandowski",
             op4 = "Mario Gomez",
             rightAns = 3
         )

         val q3 = Question(
             id = 3,
             level = "H",
             question = "Yes, the app's name sounds cool. But what does the word TREQUARTISTA actually mean?",
             op1 = "A fancy word for a goalkeeper",
             op2 = "An attacking playmaker",
             op3 = "A quarter",
             op4 = "It's not a real word! You're screwing with us",
             rightAns = 2
         )

         val q4 = Question(
             id = 4,
             level = "E",
             question = "Which team does Edin Dzeko currently play for?",
             op1 = "Molde FC",
             op2 = "Manchester City",
             op3 = "AS Roma",
             op4 = "Inter Milan",
             rightAns = 3
         )

         val q5 = Question(
             id = 5,
             level = "M",
             question = "A match between which two teams is called the Old Firm Derby?",
             op1 = "Celtic-Rangers",
             op2 = "Liverpool-Everton",
             op3 = "Newcastle-Sunderland",
             op4 = "Hearts-Hibernian",
             rightAns = 1
         )

         val q6 = Question(
             id = 6,
             level = "H",
             question = "Who, after Ryan Giggs (162), has the most assists in Premier League history?",
             op1 = "Thierry Henry",
             op2 = "Wayne Rooney",
             op3 = "Frank Lampard",
             op4 = "Cesc Fabregas",
             rightAns = 4
         )

         val q7 = Question(
             id = 7,
             level = "E",
             question = "Which German company are Lionel Messi and Paul Pogba, ambassadors for?",
             op1 = "Nike",
             op2 = "Adidas",
             op3 = "Puma",
             op4 = "New Balance",
             rightAns = 2
         )
         val q8 = Question(
             id = 8,
             level = "M",
             question = "In which World Cup did Diego Maradona score his infamous 'Hand of God' goal?",
             op1 = "1982",
             op2 = "1990",
             op3 = "1986",
             op4 = "1994",
             rightAns = 3
         )
         val q9 = Question(
             id = 9,
             level = "H",
             question = "Which Portuguese city, located 30 miles from Lisbon, is the great manager Jose Mourinho from?",
             op1 = "Setubal",
             op2 = "Madeira",
             op3 = "Braga",
             op4 = "Valladolid",
             rightAns = 1
         )
         val q10 = Question(
             id = 10,
             level = "E",
             question = "David Beckham owns a particular football club based out of an American city. Which one?",
             op1 = "Boston",
             op2 = "New York City",
             op3 = "Los Angeles",
             op4 = "Miami",
             rightAns = 4
         )
         val q11 = Question(
             id = 11,
             level = "M",
             question = "Who is the current Golden Boot winner in the Premier League 2020/21 season?",
             op1 = "Harry Kane",
             op2 = "Bruno Fernandes",
             op3 = "Mohammed Salah",
             op4 = "Timo Werner",
             rightAns = 1
         )
         val q12 = Question(
             id = 12,
             level = "H",
             question = "Who is the only player to win the Champions League with three different clubs?",
             op1 = "Rui Costa",
             op2 = "Cristiano Ronaldo",
             op3 = "Paul Scholes",
             op4 = "Clarence Seedorf",
             rightAns = 4
         )

         val q13 = Question(
             id = 13,
             level = "E",
             question = "Which French club has usupred PSG this season to become the Ligue 1 champion?",
             op1 = "Lyon",
             op2 = "Monaco",
             op3 = "LOSC Lille",
             op4 = "Auxerre",
             rightAns = 3
         )
         val q14 = Question(
             id = 14,
             level = "M",
             question = "Which football manager is credited with the revolutionary 'TIKITAKA' system?",
             op1 = "Johann Cryuff",
             op2 = "Marcelo Bielsa",
             op3 = "Pep Guardiola",
             op4 = "Sean Dyche",
             rightAns = 1
         )
         val q15 = Question(
             id = 15,
             level = "H",
             question = "Sir Patrick Stewart, apart from being a legendary actor, is associated fondly with which club?",
             op1 = "Brighton and Hove Albion",
             op2 = "Huddersfield",
             op3 = "Aston Villa",
             op4 = "Watford",
             rightAns = 2
         )



        questionList.addAll(listOf(q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15))

        val userQuestionList = questionList.filter { it.level == userLevel }

         Log.i("List of questions", "$userQuestionList")

         return userQuestionList
     }

}