package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail8.*

class Detail8: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail8)

        zoombutton8.setOnClickListener {
            startActivity(Intent(this, Zoom8::class.java))
        }

        back8.setOnClickListener {
            startActivity(Intent(this, MainMenu2::class.java))
        }
    }
}