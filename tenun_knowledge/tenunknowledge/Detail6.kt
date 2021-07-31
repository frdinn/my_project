package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail6.*

class Detail6: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail6)

        zoombutton6.setOnClickListener {
            startActivity(Intent(this, Zoom6::class.java))
        }

        back6.setOnClickListener {
            startActivity(Intent(this, MainMenu2::class.java))
        }
    }
}