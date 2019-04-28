package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_span_symptom.*
import kotlinx.android.synthetic.main.activity_span_symptomthree.*

class span_symptomthree : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_span_symptomthree)

        nextthree_btn.setOnClickListener {
            val intent = Intent(this, Main_menu::class.java)
            startActivity(intent)
        }
    }
}