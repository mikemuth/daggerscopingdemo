package com.example.daggerscopingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.daggerscopingdemo.services.MainActivityPresenter
import com.example.feature.FeatureActivityPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var mainActivityPresenter : MainActivityPresenter

    @Inject
    lateinit var _featurePresenter: FeatureActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("FeatureActivity", "Test: " + _featurePresenter.getMyValue())
        mainActivityPresenter.TrySomethingOut()
    }
}
