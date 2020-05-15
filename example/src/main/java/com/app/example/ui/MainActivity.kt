package com.app.example.ui

import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.example.R
import com.module.verifyconnectivitymodule.receivers.ConnectivityReceiver
import com.module.verifyconnectivitymodule.ui.WarningScreenActivity

class MainActivity : AppCompatActivity(), ConnectivityReceiver.ConnectivityReceiverListener  {

    private val currentBroadcast: BroadcastReceiver = ConnectivityReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = IntentFilter()
        intent.addAction("com.module.ConnectivityBroadcast")
        registerReceiver(currentBroadcast, intent)
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        showMessage(isConnected)
    }

    override fun onStop() {
        try {
            if (currentBroadcast != null) unregisterReceiver(currentBroadcast)
        } catch (e: Exception) {}

        super.onStop()
    }

    override fun onPause() {
        try {
            if (currentBroadcast != null) unregisterReceiver(currentBroadcast)
        } catch (e: Exception) {}
        super.onPause()
    }

    override fun onDestroy() {
        try {
            if (currentBroadcast != null) unregisterReceiver(currentBroadcast)
        } catch (e: Exception) {}
        super.onDestroy()
    }

    private fun showMessage(isConnected: Boolean) {
        if (!isConnected) {
            WarningScreenActivity.start(this)
        } else {
            WarningScreenActivity.start(this)
        }
    }
}