package com.example.feature

import kotlin.math.roundToInt

class FeatureActivityPresenter
{
    private var temp : Int = 0

    init {
        temp = (1..120).shuffled().first()
    }
    fun getMyValue() : Int
    {
        return temp
    }
}

