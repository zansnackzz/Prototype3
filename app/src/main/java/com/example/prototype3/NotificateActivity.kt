package com.example.prototype3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prototype3.Noti.NotificationUtils
import com.example.prototype3.PL.Paralysiss.ParalysisS1NU
import com.example.prototype3.PL.Paralysiss2.ParalysisS2NU
import com.example.prototype3.PL.Paralysiss3.ParalysisS3NU
import com.example.prototype3.PL.Paralysiss4.ParalysisS4NU
import com.example.prototype3.PL.Paralysiss5.ParalysisS5NU
import com.example.prototype3.PL.Paralysiss6.ParalysisS6NU
import com.example.prototype3.PL.Paralysiss7.ParalysisS7NU
import com.example.prototype3.PL.Paralysiss8.ParalysisS8NU
import com.example.prototype3.PL.Paralysiss9.ParalysisS9NU
import java.util.*

class NotificateActivity : AppCompatActivity() {
    private val mNotificationTime = Calendar.getInstance().timeInMillis + 5000 //Set after 5 seconds from the current time.
    private var mNotified = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificate)
        if (!mNotified) {
            NotificationUtils().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS1NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS2NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS3NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS4NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS5NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS6NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS7NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS8NU().setNotification(mNotificationTime, this@NotificateActivity)
            ParalysisS9NU().setNotification(mNotificationTime, this@NotificateActivity)

        }


    }



}

