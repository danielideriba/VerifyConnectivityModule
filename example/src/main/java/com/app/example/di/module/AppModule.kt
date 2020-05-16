package com.app.example.di.module

import android.app.Application
import android.content.Context
import com.app.example.ui.MainActivity
import com.module.verifyconnectivitymodule.di.module.VerifyConnectivityModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    @Singleton
    fun provideContext(application: Application): Context =
        application.applicationContext

    @Provides
    fun providesMainActivity() : MainActivity {
        return MainActivity()
    }


}