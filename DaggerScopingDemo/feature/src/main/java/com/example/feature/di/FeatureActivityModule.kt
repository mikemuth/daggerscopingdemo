package com.example.feature.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import com.example.feature.FeatureActivity
import javax.inject.Singleton


@Module
abstract class FeatureActivityModule {
    @ContributesAndroidInjector
    abstract fun contributeFeatureActivity(): FeatureActivity
}