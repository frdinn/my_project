package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail9.*

class Detail9: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail9)

        zoombutton9.setOnClickListener {
            startActivity(Intent(this, Zoom9::class.java))
        }

        back9.setOnClickListener {
            startActivity(Intent(this, MainMenu3::class.java))
        }
    }
}