package com.example.feature.di

import com.example.feature.FeatureActivity
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    FeatureModule::class])
interface FeatureComponent {
    var featureActivity: FeatureActivity
}