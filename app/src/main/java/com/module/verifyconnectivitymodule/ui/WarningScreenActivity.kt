package com.module.verifyconnectivitymodule.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.module.verifyconnectivitymodule.R

open class WarningScreenActivity : AppCompatActivity() {
    companion object {
        private fun newIntent(
            context: Context
        ): Intent {
            val intent = Intent(context, WarningScreenActivity::class.java)
            return intent
        }

        fun start(context: Context) {
            val intent = newIntent(context)
            ContextCompat.startActivity(context, intent, null)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_warning_screen)

    }
}