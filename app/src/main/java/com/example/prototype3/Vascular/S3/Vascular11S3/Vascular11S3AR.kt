package com.example.prototype3.Vascular.S3.Vascular11S3

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Vascular11S3AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Vascular11S3NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}