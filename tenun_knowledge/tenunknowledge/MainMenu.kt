package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.main_menu.*

class MainMenu : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)

        gambar1.setOnClickListener {
            startActivity(Intent(this, Detail1::class.java))
        }

        gambar2.setOnClickListener {
            startActivity(Intent(this, Detail2::class.java))
        }

        gambar3.setOnClickListener {
            startActivity(Intent(this, Detail3::class.java))
        }

        gambar4.setOnClickListener {
            startActivity(Intent(this, Detail4::class.java))
        }

        NextMenu.setOnClickListener {
            startActivity(Intent(this, MainMenu2::class.java))
        }
    }
}