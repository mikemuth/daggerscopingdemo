package com.example.daggerscopingdemo.di

import com.example.daggerscopingdemo.MainActivity
import com.example.feature.di.FeatureModule
import dagger.Component

@Component(modules = [(FeatureModule::class)])
interface PresenterInjector {
     /* Injects required dependencies into the specified PostPresenter.
     * @param postPresenter PostPresenter in which to inject the dependencies
     */
    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun build(): PresenterInjector

        fun featureModule(featureModule: FeatureModule): Builder
    }
}