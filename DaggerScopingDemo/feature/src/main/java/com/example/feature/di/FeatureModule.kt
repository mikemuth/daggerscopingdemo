package com.example.feature.di

import com.example.feature.FeatureActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Scope

@Module
class FeatureModule {
    @Provides
    fun provideFeatureActivityPresenter() : FeatureActivityPresenter
    {
        return FeatureActivityPresenter()
    }
}

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class
FeatureScope