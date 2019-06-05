package com.example.prototype3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tapadoo.alerter.Alerter

class Alerttime : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerttime)
    }

    public fun Alertime(view:View){
        Alerter.create(this)
            .setText("แจ้งเตือนวิธีการรักษา")
            .addButton("รับแจ้งตือน",R.style.AlertStyle,View.OnClickListener {
                Alerter.create(this)
                    .setText("07.00 ป้อนข้าวให้ผู้ป่วย")
                    .setBackgroundColorInt(Color.parseColor("#1acc9c"))
                    .setTextAppearance(Color.parseColor("#34495e"))
                    .show();
            })
            .setBackgroundColorInt(Color.parseColor("#e74c3c"))
            .show();

    }
}
