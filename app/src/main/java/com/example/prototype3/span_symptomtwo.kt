package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_span_symptom.*

class span_symptomtwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_span_symptomtwo)
        nexttwo_btn.setOnClickListener {
            val intent = Intent(this, span_symptomthree::class.java)
            startActivity(intent)
        }
    }
}
