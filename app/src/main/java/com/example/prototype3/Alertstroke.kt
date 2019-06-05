package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alertstroke.*

class Alertstroke : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertstroke)
        Storkeone_btn.setOnClickListener{
            val intent = Intent(this, Alerttime::class.java)
            startActivity(intent)
        }
    }
}
