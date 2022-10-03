package com.example.pharmaquizapp

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Question>? = null
    private var mSelectedAnswer : Int = 0
    private var mUserName : String? = null
    private var mCorrectAnswers : Int = 0

    private var progressBar : ProgressBar? = null
    private var tvProgress : TextView? = null
    private var tvQuestion : TextView? = null

    private var answer0 : TextView? = null
    private var answer1 : TextView? = null
    private var answer2 : TextView? = null
    private var answer3 : TextView? = null
    private var answer4 : TextView? = null

    private var btnSubmit : Button? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        progressBar = findViewById(R.id.progress_bar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)

        answer0 = findViewById(R.id.answer_0)
        answer1 = findViewById(R.id.answer_1)
        answer2 = findViewById(R.id.answer_2)
        answer3 = findViewById(R.id.answer_3)
        answer4 = findViewById(R.id.answer_4)
        btnSubmit = findViewById(R.id.submit_button)

        answer0?.setOnClickListener(this)
        answer1?.setOnClickListener(this)
        answer2?.setOnClickListener(this)
        answer3?.setOnClickListener(this)
        answer4?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        mQuestionList = Constants.getQuestions()

        setQuestion()
        defaultAnswersView()

    }

    private fun setQuestion() {
        defaultAnswersView()
        val question: Question = mQuestionList!![mCurrentPosition - 1]

        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition/${progressBar?.max}"
        tvQuestion?.text = question.question

        answer0?.text = question.answer0
        answer1?.text = question.answer1
        answer2?.text = question.answer2
        answer3?.text = question.answer3
        answer4?.text = question.answer4

//        if(mCurrentPosition == mQuestionList!!.size){
//            btnSubmit?.text = "KONIEC"
//        }else{
//            btnSubmit?.text = "  DALEJ >"
//        }
    }

    private fun defaultAnswersView(){
        val answers = ArrayList<TextView>()

        answer0?.let{
            answers.add(0, it)
        }
        answer1?.let{
            answers.add(1, it)
        }
        answer2?.let{
            answers.add(2, it)
        }
        answer3?.let{
            answers.add(3, it)
        }
        answer4?.let{
            answers.add(4, it)
        }

        for(answer in answers){
            answer.typeface = Typeface.DEFAULT
            answer.background = ContextCompat.getDrawable(this, R.drawable.answer_bg)
        }

    }

    private fun selectedAnswerView(tv : TextView, selectedAnswerNum : Int){
        defaultAnswersView()
        mSelectedAnswer = selectedAnswerNum
        tv.typeface = Typeface.DEFAULT_BOLD
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_answer_bg)
    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.answer_0 -> {
                answer0?.let { selectedAnswerView(it, 0) }
            }

            R.id.answer_1 -> {
                answer1?.let { selectedAnswerView(it, 1) }
            }

            R.id.answer_2 -> {
                answer2?.let { selectedAnswerView(it, 2) }
            }

            R.id.answer_3 -> {
                answer3?.let { selectedAnswerView(it, 3) }
            }

            R.id.answer_4 -> {
                answer4?.let { selectedAnswerView(it, 4) }
            }

            R.id.submit_button -> {
                if(mSelectedAnswer == 0){
                    mCurrentPosition++

                    if(mCurrentPosition <= mQuestionList!!.size) setQuestion()
                    else{
                        val intent = Intent(this, ResultActivity::class.java)
                        intent.putExtra(Constants.USER_NAME, mUserName)
                        intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                        intent.putExtra(Constants.QUESTIONS_TOTAL, mQuestionList?.size)
                        startActivity(intent)
                        finish()
                    }


                }else {
                    val question = mQuestionList?.get(mCurrentPosition-1)
                    if(question!!.correctAnswer != mSelectedAnswer){
                        validateAnswerView(mSelectedAnswer, R.drawable.wrong_answer_bg)
                    }else mCorrectAnswers++

                    validateAnswerView(question.correctAnswer, R.drawable.correct_answer_bg)

                    if(mCurrentPosition == mQuestionList!!.size){
                        btnSubmit?.text = "KONIEC"
                    }else{
                        btnSubmit?.text = "  DALEJ >"
                    }

                    mSelectedAnswer = 0
                }

            }
        }
    }

    private fun validateAnswerView(answer: Int, drawableView: Int){
        when(answer){
            0 -> answer0?.background = ContextCompat.getDrawable(this, drawableView)
            1 -> answer1?.background = ContextCompat.getDrawable(this, drawableView)
            2 -> answer2?.background = ContextCompat.getDrawable(this, drawableView)
            3 -> answer3?.background = ContextCompat.getDrawable(this, drawableView)
            4 -> answer4?.background = ContextCompat.getDrawable(this, drawableView)
        }
    }
}