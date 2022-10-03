package com.example.pharmaquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val userName : EditText = findViewById(R.id.user_name)

        btnStart.setOnClickListener {

            if(userName.text.isEmpty()) {
                Toast.makeText(this, "Podaj swoje imię!", Toast.LENGTH_LONG).show()

            }else if(userName.text.length < 2){
                Toast.makeText(this,"Imię musi składać się z co najmniej dwóch liter!", Toast.LENGTH_LONG).show()

            }else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, userName.text.toString())
                startActivity(intent)
                finish()  // closes current activity
            }

        }
    }
}