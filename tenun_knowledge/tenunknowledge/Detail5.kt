package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail5.*

class Detail5: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail5)

        zoombutton5.setOnClickListener {
            startActivity(Intent(this, Zoom5::class.java))
        }

        back5.setOnClickListener {
            startActivity(Intent(this, MainMenu2::class.java))
        }
    }
}