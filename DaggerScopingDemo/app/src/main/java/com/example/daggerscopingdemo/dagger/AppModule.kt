package com.example.daggerscopingdemo.dagger

import com.example.daggerscopingdemo.services.MainActivityPresenter
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule
{
    @Provides
    @Singleton
    fun provideMainActivityPresenter() : MainActivityPresenter
    {
        return MainActivityPresenter()
    }
}