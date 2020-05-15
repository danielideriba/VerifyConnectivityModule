package com.app.example.di.module

import androidx.lifecycle.ViewModelProvider
import com.app.example.utils.FactoryViewModel
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: FactoryViewModel): ViewModelProvider.Factory
}