package com.example.daggerscopingdemo

import com.example.daggerscopingdemo.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class DaggerScopingDemoApplication : DaggerApplication()
{
    private val appComponent: AndroidInjector<DaggerScopingDemoApplication> by lazy {
        DaggerAppComponent
            .builder()
            .create(this)
    }
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return appComponent
    }
}