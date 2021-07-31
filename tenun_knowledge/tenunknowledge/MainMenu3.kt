package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_menu3.*

class MainMenu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu3)

        gambar9.setOnClickListener {
            startActivity(Intent(this, Detail9::class.java))
        }

        gambar10.setOnClickListener {
            startActivity(Intent(this, Detail10::class.java))
        }

        gambar11.setOnClickListener {
            startActivity(Intent(this, Detail11::class.java))
        }

        BackMenu2.setOnClickListener {
            startActivity(Intent(this, MainMenu2::class.java))
        }
    }
}