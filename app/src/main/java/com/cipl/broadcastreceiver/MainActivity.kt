package com.cipl.broadcastreceiver

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var myBroadcast = MyBroadcast()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        val intentFilter = IntentFilter(Intent.ACTION_TIME_TICK)    // Event will be triggered when time changes by 1 min everytime
        registerReceiver(myBroadcast, intentFilter)

        // This is called Explicit Broadcast Receiver because we have declared MyBroadcast class explicitly
        val intent = Intent(this, MyBroadcast::class.java)
        sendBroadcast(intent)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(myBroadcast)
    }
}