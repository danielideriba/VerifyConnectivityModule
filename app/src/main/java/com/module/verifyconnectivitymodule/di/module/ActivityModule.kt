package com.module.verifyconnectivitymodule.di.module

import com.module.verifyconnectivitymodule.ui.WarningScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeWarningScreenActivity(): WarningScreenActivity
}