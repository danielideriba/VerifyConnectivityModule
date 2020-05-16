package com.app.example.di.components

import android.app.Application
import com.app.example.App
import com.app.example.di.module.ActivityModule
import com.app.example.di.module.AppModule
import com.app.example.di.module.ViewModelModule
import com.module.verifyconnectivitymodule.di.module.VerifyConnectivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        ViewModelModule::class,
        VerifyConnectivityModule::class
    ]
)
interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(app: App)
}