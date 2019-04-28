package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input_detail.*

class Input_detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_detail)

        man_btn.setOnClickListener {
            val intent = Intent(this,Man_input::class.java)
            startActivity(intent)
        }
        girl_btn.setOnClickListener {
            val intent = Intent(this,Girl_input::class.java)
            startActivity(intent)
        }
    }
}
