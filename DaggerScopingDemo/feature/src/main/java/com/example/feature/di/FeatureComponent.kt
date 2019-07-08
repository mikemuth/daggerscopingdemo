package com.example.feature.di

import com.example.feature.FeatureActivity
import dagger.Component
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Subcomponent(modules = [
    AndroidInjectionModule::class,
    FeatureModule::class])
interface FeatureComponent  {
    fun contributeFeatureActivity(): FeatureActivity
}