package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_alertdisease.*
import kotlinx.android.synthetic.main.activity_alertparalysis.*

class Alertparalysis : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alertparalysis)
        paralysisone_btn.setOnClickListener{
            val intent = Intent(this, Alerttime::class.java)
            startActivity(intent)
        }
    }
}
