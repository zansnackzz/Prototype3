package com.example.prototype3.Parkinson.S2.Parkinson11S2

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.prototype3.R
import kotlinx.android.synthetic.main.activity_result.*

class Parkinson11S2RA: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        if (intent.getBooleanExtra("notification", false)) { //Just for confirmation
            txtTitleView.text = intent.getStringExtra("title")
            txtMsgView.text = intent.getStringExtra("message")

        }

    }
}

