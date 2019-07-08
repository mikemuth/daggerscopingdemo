package com.example.daggerscopingdemo

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import com.example.daggerscopingdemo.services.MainActivityPresenter
import com.example.feature.FeatureActivityPresenter
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import android.content.Intent
import com.example.feature.FeatureActivity


class MainActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var mainActivityPresenter : MainActivityPresenter

    @Inject
    lateinit var featurePresenter: FeatureActivityPresenter

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainText.text = "${mainActivityPresenter.TrySomethingOut()} - ${featurePresenter.getMyValue()}"

        button.setOnClickListener {
            val intent = Intent(this, FeatureActivity::class.java)
            startActivity(intent)
        }
    }
}
