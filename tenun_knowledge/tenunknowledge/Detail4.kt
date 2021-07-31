package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail4.*

class Detail4: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail4)

        zoombutton4.setOnClickListener {
            startActivity(Intent(this, Zoom4::class.java))
        }

        back4.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}