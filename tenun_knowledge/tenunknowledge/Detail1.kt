package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail1.*


class Detail1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail1)

        zoombutton1.setOnClickListener {
            startActivity(Intent(this, Zoom1::class.java))
        }

        back1.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}

