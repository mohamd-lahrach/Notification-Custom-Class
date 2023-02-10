package com.lahrachtech.notify

import ShowMyOwnNotification
import android.app.*
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val notification = ShowMyOwnNotification(this)
        val title = resources.getText(R.string.title_notify).toString()
        val content = resources.getText(R.string.content_notify).toString()
        btnShwoNotification.setOnClickListener {
            notification.showNotification(title, content, MainActivity::class.java)
        }
    }
}