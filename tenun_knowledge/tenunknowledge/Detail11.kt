package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail11.*

class Detail11: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail11)

        zoombutton11.setOnClickListener {
            startActivity(Intent(this, Zoom11::class.java))
        }

        back11.setOnClickListener {
            startActivity(Intent(this, MainMenu3::class.java))
        }
    }
}