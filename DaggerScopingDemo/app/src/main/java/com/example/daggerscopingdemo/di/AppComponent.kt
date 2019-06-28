package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.MainActivity
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton
import android.app.Application
import com.example.daggerscopingdemo.DaggerScopingDemoApplication
import dagger.BindsInstance
import dagger.android.AndroidInjector

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBuilder::class])
interface AppComponent : AndroidInjector<DaggerScopingDemoApplication> {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
    var mainActivity: MainActivity
}