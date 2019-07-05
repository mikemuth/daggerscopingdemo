package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.di.FeatureModule
import javax.inject.Singleton

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [FeatureModule::class, AppModule::class])
    @Singleton
    abstract fun contributeMainActivity(): MainActivity
}