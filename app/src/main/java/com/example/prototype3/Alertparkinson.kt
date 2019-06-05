package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alertparalysis.*
import kotlinx.android.synthetic.main.activity_alertparkinson.*

class Alertparkinson : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertparkinson)
        Pakinsonone_btn.setOnClickListener{
            val intent = Intent(this, Alerttime::class.java)
            startActivity(intent)
        }
    }
}
