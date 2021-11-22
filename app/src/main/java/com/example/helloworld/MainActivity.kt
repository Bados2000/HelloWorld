package com.example.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    lateinit var buttonGoToNext: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonGoToNext = findViewById(R.id.buttonGoToNext)

        buttonGoToNext.setOnClickListener{
            val intent: Intent = Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}