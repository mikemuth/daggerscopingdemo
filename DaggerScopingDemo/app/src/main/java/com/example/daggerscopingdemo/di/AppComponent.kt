package com.example.daggerscopingdemo.di

import dagger.Component
import com.example.daggerscopingdemo.DaggerScopingDemoApplication
import com.example.daggerscopingdemo.MainActivity
import dagger.android.AndroidInjector
import com.example.feature.FeatureActivity
import com.example.feature.di.FeatureModule
import dagger.android.support.AndroidSupportInjectionModule

@Component(modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        FeatureModule::class
//        ContributeActivityModule::class
    ])
interface AppComponent : AndroidInjector<DaggerScopingDemoApplication> { // 3
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<DaggerScopingDemoApplication>() // 4

    fun inject(mainActivity: MainActivity)
    fun inject(featureActivity: FeatureActivity)

}