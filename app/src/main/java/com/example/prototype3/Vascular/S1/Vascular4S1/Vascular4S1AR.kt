package com.example.prototype3.Vascular.S1.Vascular4S1

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Vascular4S1AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Vascular4S1NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}