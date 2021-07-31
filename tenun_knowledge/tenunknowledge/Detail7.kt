package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail7.*

class Detail7: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail7)

        zoombutton7.setOnClickListener {
            startActivity(Intent(this, Zoom7::class.java))
        }

        back7.setOnClickListener {
            startActivity(Intent(this, MainMenu2::class.java))
        }
    }
}