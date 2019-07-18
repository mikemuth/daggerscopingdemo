package com.example.feature

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity;
import dagger.android.support.DaggerAppCompatActivity

import kotlinx.android.synthetic.main.activity_feature.*
import javax.inject.Inject

class FeatureActivity : DaggerAppCompatActivity() {
    @Inject
    lateinit var featureActivityPresenter : FeatureActivityPresenter

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)

        textView2.text = featureActivityPresenter.getMyValue().toString() + " "
    }

}
