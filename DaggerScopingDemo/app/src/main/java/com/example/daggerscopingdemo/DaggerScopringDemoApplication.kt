package com.example.daggerscopingdemo

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import javax.inject.Inject



class DaggerScopingDemoApplication : DaggerApplication()
{
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return  DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
    override fun onCreate() {
        super.onCreate()
    }
//    fun createDaggerGraph()
//    {
//        DaggerAppComponent.builder()
//            .application(this)
//            .build()
//        DaggerAppComponent.builder()
//                .appModule(AppModule())
//                .featureModule(FeatureModule())
//                .build()
//    }
}