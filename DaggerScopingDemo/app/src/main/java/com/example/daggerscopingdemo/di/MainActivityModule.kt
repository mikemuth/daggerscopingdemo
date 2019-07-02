package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.di.FeatureModule

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [FeatureModule::class, AppModule::class])
    abstract fun contributeMainActivityInjector(): MainActivity
}