package com.example.prototype3.Parkinson.S2.Parkinson10S2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Parkinson10S2AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Parkinson10S2NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}