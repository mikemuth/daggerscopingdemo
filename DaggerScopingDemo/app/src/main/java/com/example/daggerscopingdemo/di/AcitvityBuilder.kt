package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.MainActivity
import com.example.feature.FeatureActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.di.FeatureModule


@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector(modules = [FeatureModule::class])
    internal abstract fun bindFeatureActivity(): FeatureActivity
    @ContributesAndroidInjector(modules = [FeatureModule::class])
    internal abstract fun bindMainActivity(): MainActivity

}