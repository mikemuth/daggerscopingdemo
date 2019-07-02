package com.example.daggerscopingdemo.di

import com.example.feature.di.FeatureActivityModule
import dagger.Module

@Module(includes = [
    MainActivityModule::class,
    FeatureActivityModule::class
])
abstract class ContributeActivityModule {
}