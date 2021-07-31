package com.example.tenunknowledge

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tenun.*

class Tenun : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tenun)

        imageButton4.setOnClickListener {
            startActivity(Intent(this, Transisi::class.java))
        }
    }
}