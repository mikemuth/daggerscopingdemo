package com.example.daggerscopingdemo.dagger

import com.example.daggerscopingdemo.MainActivity
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,,
    AppModule::class])
interface AppComponent {
    var mainActivity: MainActivity
}