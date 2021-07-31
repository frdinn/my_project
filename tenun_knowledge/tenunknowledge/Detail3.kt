package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail3.*

class Detail3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail3)

        zoombutton3.setOnClickListener {
            startActivity(Intent(this, Zoom3::class.java))
        }

        back3.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}