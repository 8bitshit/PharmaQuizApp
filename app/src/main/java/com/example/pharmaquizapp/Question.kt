package com.example.pharmaquizapp

data class Question(
    // class constructor
    val id : Int,
    val question : String,
    val answer0 : String,
    val answer1 : String,
    val answer2 : String,
    val answer3 : String,
    val answer4 : String,
    val correctAnswer : Int

)
