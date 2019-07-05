package com.example.feature.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.FeatureActivity
import javax.inject.Singleton


@Module
abstract class FeatureActivityModule {
    @ContributesAndroidInjector(modules = [FeatureModule::class])
    @Singleton
    abstract fun contributeFeatureActivity(): FeatureActivity
}