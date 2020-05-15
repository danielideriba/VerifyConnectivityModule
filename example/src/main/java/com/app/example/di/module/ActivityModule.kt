package com.app.example.di.module

import com.app.example.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by danielideriba on 08,February,2019
 * TODO: All activity with injection must be declared here
 * Ex:. @ContributesAndroidInjector(modules = arrayOf(FragmentModule::class))
 *      internal abstract fun contribute[NAME_ACTIVITY](): [NAME_ACTIVITY]
 */

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    internal abstract fun contributeMainActivity(): MainActivity

}