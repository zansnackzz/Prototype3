package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alertdisease.*
import kotlinx.android.synthetic.main.activity_alertparkinson.*

class Alertdisease : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertdisease)

        Stroke_btn.setOnClickListener{
            val intent = Intent(this, Alertstroke::class.java)
            startActivity(intent)
        }
        Parkinson_btn.setOnClickListener{
            val intent = Intent(this, Alertparkinson::class.java)
            startActivity(intent)
        }
        Paralysis_btn.setOnClickListener{
            val intent = Intent(this, Alertparalysis::class.java)
            startActivity(intent)
            }

    }
}
