package com.example.daggerscopingdemo

import android.os.Bundle
import android.util.Log
import com.example.daggerscopingdemo.services.MainActivityPresenter
import com.example.feature.FeatureActivityPresenter
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var mainActivityPresenter : MainActivityPresenter

    @Inject
    lateinit var featurePresenter: FeatureActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("FeatureActivity", "Test: " + featurePresenter.getMyValue())
        mainActivityPresenter.TrySomethingOut()
    }
}
