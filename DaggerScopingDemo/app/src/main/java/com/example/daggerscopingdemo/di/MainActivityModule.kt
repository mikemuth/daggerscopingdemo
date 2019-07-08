package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.di.FeatureModule
import com.example.feature.di.FeatureScope
import javax.inject.Singleton

@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [AppModule::class])
    abstract fun contributeMainActivity(): MainActivity
}