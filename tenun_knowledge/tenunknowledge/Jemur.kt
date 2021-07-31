package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.jemur.*

class Jemur : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.jemur)

        imageButton3.setOnClickListener {
            startActivity(Intent(this, Tenun::class.java))
        }
    }
}