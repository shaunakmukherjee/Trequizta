package com.example.trequizta

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.trequizta.databinding.ActivityQuestionBinding

class QuestionActivity : AppCompatActivity(), View.OnClickListener {

    /* userSelectedOption is initially zero as user is starting the quiz. It's value
     * will be overwritten. Similarly, myQuestionList is also initially null.
     *
     */
    private var myCurrentQuestion: Int = 1
    private var myQuestionList: List<Question>? = null
    private var userSelectedOption : Int = 0
    private lateinit var binding: ActivityQuestionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_question)

        val userDiffLevel = intent.getStringExtra(UserVariables.DIFF_LEVEL)

        //Log.i("User Level is:", "$userDiffLevel")
        //Log.i("Questions are: ", "${UserVariables.getQuestions(userDiffLevel.toString())}")

        binding.backArrow.setOnClickListener{
            startActivity(Intent(this, Level::class.java))
        }

        myQuestionList = UserVariables.getQuestions(userDiffLevel.toString())

        setEachQuestion()

        binding.optionOne.setOnClickListener(this)
        binding.optionTwo.setOnClickListener(this)
        binding.optionThree.setOnClickListener(this)
        binding.optionFour.setOnClickListener(this)

        binding.btnConfirm.setOnClickListener(this)

    }

    /* this method individually sets each question */
    private fun setEachQuestion(){


        val question: Question = myQuestionList!![myCurrentQuestion - 1]

        //Log.i("First question is: ", question.question)

        optionsView()

        if(myCurrentQuestion == myQuestionList!!.size)
            binding.buttonConfirm = "FINISH"
        else
            binding.buttonConfirm = "CONFIRM"

        binding.questionBar.progress = myCurrentQuestion

        binding.questionBody = question.question

        binding.option1 = question.op1
        binding.option2 = question.op2
        binding.option3 = question.op3
        binding.option4 = question.op4

    }

    /* default method for initializing options */
    private fun optionsView(){
        val options = ArrayList<TextView>()

        options.addAll(listOf(binding.optionOne, binding.optionTwo, binding.optionThree, binding.optionFour))

        for (option in options){
            option.setTextColor(Color.parseColor("#FFFFFF"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.option_background)

        }


    }

    /* method for what happens when options is clicked/selected */
    private fun selectedOptionView(v: TextView, selectedPosition: Int){

        optionsView()

        userSelectedOption = selectedPosition

        v.setTextColor(Color.parseColor("#363A43"))
        v.setTypeface(v.typeface, Typeface.BOLD_ITALIC)
        v.background = ContextCompat.getDrawable(this, R.drawable.selectedoption_background)

    }

    /* sets particular background when selected answer is right or wrong after confirming */

    private fun answerHandler(rightAnswer: Int, drawableView: Int){
        when(rightAnswer){
            1 -> {
                binding.optionOne.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                binding.optionTwo.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                binding.optionThree.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                binding.optionFour.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.optionOne -> {
                selectedOptionView(binding.optionOne, 1)
            }
            R.id.optionTwo -> {
                selectedOptionView(binding.optionTwo, 2)
            }
            R.id.optionThree -> {
                selectedOptionView(binding.optionThree, 3)
            }
            R.id.optionFour -> {
                selectedOptionView(binding.optionFour, 4)
            }
            R.id.btnConfirm -> {
                if (userSelectedOption == 0) {
                    myCurrentQuestion++
                    Log.i("Current Question=", "$myCurrentQuestion")

                    //until the quiz finishes, each new question is set
                    when {
                        myCurrentQuestion <= myQuestionList!!.size -> {
                            setEachQuestion()
                        }
                        else -> {
                            Toast.makeText(this, "You've completed the Quiz!", Toast.LENGTH_SHORT)
                                .show()
                        }
                    }
                }
                else {
                    val question = myQuestionList?.get(myCurrentQuestion-1)
                    Log.i("This question:", "${question!!.question}")

                    if(question!!.rightAns != userSelectedOption)
                        answerHandler(userSelectedOption, R.drawable.wrongoption_background)

                    answerHandler(question.rightAns, R.drawable.correctoption_background)
                    //this displays the correct answer regardless of what the user has selected


                    /*
                    This is where the change needs to be done. In last question it shows 'finish' and escapes.
                    It needs to show 'submit' first and then 'finish' after the right answer is displayed.
                     */
                    if(myCurrentQuestion == myQuestionList!!.size)
                        binding.buttonConfirm = "FINISH"
                    else
                        binding.buttonConfirm= "NEXT"

                    userSelectedOption = 0
                }

            }
        }
    }

}