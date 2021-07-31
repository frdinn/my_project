package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.intro.*

class Intro : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.intro)

        Intro.setOnClickListener {
            startActivity(Intent(this, Benang::class.java))
        }

        skip.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}