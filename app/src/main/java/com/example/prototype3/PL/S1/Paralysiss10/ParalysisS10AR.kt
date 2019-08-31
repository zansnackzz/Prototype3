package com.example.prototype3.PL.S1.Paralysiss10

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class ParalysisS10AR : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val service = Intent(context, ParalysisS10NS::class.java)
        service.putExtra("reason", intent?.getStringExtra("reason"))
        service.putExtra("timestamp", intent?.getLongExtra("timestamp", 0))

        context?.startService(service)
    }
}