package com.example.prototype3.PL.S2.Paralysiss2S2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class Paralysiss2S1AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, Paralysiss2S1NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}