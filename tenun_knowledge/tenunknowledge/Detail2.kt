package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail2.*

class Detail2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail2)

        zoombutton2.setOnClickListener {
            startActivity(Intent(this, Zoom2::class.java))
        }

        back2.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}