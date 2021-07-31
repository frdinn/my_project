package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail10.*

class Detail10: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail10)

        zoombutton10.setOnClickListener {
            startActivity(Intent(this, Zoom10::class.java))
        }

        back10.setOnClickListener {
            startActivity(Intent(this, MainMenu3::class.java))
        }
    }
}