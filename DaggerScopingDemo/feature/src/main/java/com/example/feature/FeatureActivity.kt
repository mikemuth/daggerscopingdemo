package com.example.feature

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.activity_feature.*
import javax.inject.Inject

class FeatureActivity : AppCompatActivity() {
    @Inject
    lateinit var featureActivityPresenter : FeatureActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
        setSupportActionBar(toolbar)
        Log.d("FeatureActivity", "Test: " + featureActivityPresenter.getMyValue())
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
