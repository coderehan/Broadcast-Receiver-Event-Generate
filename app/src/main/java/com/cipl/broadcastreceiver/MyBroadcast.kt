package com.cipl.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcast: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        when(intent?.action){
            Intent.ACTION_TIME_TICK -> {
                Toast.makeText(context, "Time Completed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}