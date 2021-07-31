package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_menu2.*

class MainMenu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu2)

        gambar5.setOnClickListener {
            startActivity(Intent(this, Detail5::class.java))
        }

        gambar6.setOnClickListener {
            startActivity(Intent(this, Detail6::class.java))
        }

        gambar7.setOnClickListener {
            startActivity(Intent(this, Detail7::class.java))
        }

        gambar8.setOnClickListener {
            startActivity(Intent(this, Detail8::class.java))
        }

        NextMenu2.setOnClickListener {
            startActivity(Intent(this, MainMenu3::class.java))
        }

        BackMenu.setOnClickListener {
            startActivity(Intent(this, MainMenu::class.java))
        }
    }
}