package com.example.feature.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.FeatureActivity


@Module
abstract class FeatureActivityModule {
    @ContributesAndroidInjector(modules = [FeatureModule::class])
    abstract fun contributeFeatureActivityInjector(): FeatureActivity
}