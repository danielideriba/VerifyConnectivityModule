package com.ideriba.module.verifyconnectivity.di.module

import com.ideriba.module.verifyconnectivity.ui.WarningScreenActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {
    @ContributesAndroidInjector
    internal abstract fun contributeWarningScreenActivity(): WarningScreenActivity
}