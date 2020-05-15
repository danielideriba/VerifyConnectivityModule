package com.app.example.ui

import android.content.IntentFilter
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.example.R
import com.module.verifyconnectivitymodule.receivers.ConnectivityReceiver
import com.module.verifyconnectivitymodule.ui.WarningScreenActivity

class MainActivity : AppCompatActivity(), ConnectivityReceiver.ConnectivityReceiverListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerReceiver(ConnectivityReceiver(), IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
    }

    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        showMessage(isConnected)
    }

    private fun showMessage(isConnected: Boolean) {
        if (!isConnected) {
            WarningScreenActivity.start(this)
        } else {
            WarningScreenActivity.start(this)
        }
    }
}
