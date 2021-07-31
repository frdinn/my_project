package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.pewarna.*

class Pewarna : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pewarna)

        imageButton2.setOnClickListener {
            startActivity(Intent(this, Jemur::class.java))
        }
    }
}