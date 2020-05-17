package com.module.verifyconnectivitymodule

import android.content.BroadcastReceiver
import android.content.IntentFilter
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.module.verifyconnectivitymodule.receivers.ConnectivityReceiver
import com.module.verifyconnectivitymodule.ui.WarningScreenActivity
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class MainActivityTest : AppCompatActivity(), ConnectivityReceiver.ConnectivityReceiverListener {

    private var currentBroadcast: BroadcastReceiver? = null

    @Test
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        configReceiver()
    }

    @Test
    fun configReceiver(){
        registerReceiver(currentBroadcast, IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION))
    }

    @Test
    override fun onNetworkConnectionChanged(isConnected: Boolean) {
        if (!isConnected) {
            WarningScreenActivity.start(this)
        } else {
            WarningScreenActivity.start(this)
        }
    }
}