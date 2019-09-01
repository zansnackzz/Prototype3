package com.example.prototype3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result_.*

class Result_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result_)

        val status_point = intent.getStringExtra(Detail_Show_For_Old_Patient.PATIENT_POINT)
        val pro_status_point = status_point.toInt()
        result_point.setText("$pro_status_point")


        when (pro_status_point){

            in 1..200 -> status.setText("แย่ลง")
            in 201..400 -> status.setText("คงที่")
            in 401..600 -> status.setText("ดีขึ้น")

        }

        btn_back.setOnClickListener {

            val intent = Intent(this,List_patient::class.java)
            startActivity(intent)


        }






    }
}
