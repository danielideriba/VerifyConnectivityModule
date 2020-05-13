package com.module.verifyconnectivitymodule.di.module

import android.app.Application
import android.content.SharedPreferences
import android.preference.PreferenceManager
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
    fun providePreferences(application: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(application)
    }

}