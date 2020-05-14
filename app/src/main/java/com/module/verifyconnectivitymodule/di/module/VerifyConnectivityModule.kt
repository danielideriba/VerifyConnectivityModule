package com.module.verifyconnectivitymodule.di.module

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.module.verifyconnectivitymodule.receivers.ConnectivityReceiver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        ActivityModule::class
    ]
)
class VerifyConnectivityModule{

    @Singleton
    @Provides
    fun provideConnectivityReceiver(): ConnectivityReceiver {
        return ConnectivityReceiver()
    }

}