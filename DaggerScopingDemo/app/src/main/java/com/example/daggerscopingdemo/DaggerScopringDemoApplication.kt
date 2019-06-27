package com.example.daggerscopingdemo

import android.app.Application
import com.example.daggerscopingdemo.dagger.AppModule
import com.example.feature.di.FeatureModule

class DaggerScopingDemoApplication : Application()
{
    override fun onCreate() {
        super.onCreate()
        createDaggerGraph()
    }

    private  fun createDaggerGraph()
    {
        DaggerAppComponent.builder()
                .appModule(AppModule())
                .featureModule(FeatureModule())
                .build()
    }
}