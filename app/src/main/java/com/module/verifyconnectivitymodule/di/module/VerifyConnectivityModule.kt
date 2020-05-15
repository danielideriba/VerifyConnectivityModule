package com.module.verifyconnectivitymodule.di.module

import com.module.verifyconnectivitymodule.receivers.ConnectivityReceiver
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        ActivityConnectivityModule::class
    ]
)
class VerifyConnectivityModule{

    @Singleton
    @Provides
    fun provideConnectivityReceiver(): ConnectivityReceiver {
        return ConnectivityReceiver()
    }

}