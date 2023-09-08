package com.makuta.jokes

import android.util.Log

object Utils {

    const val JOKE_API = "https://v2.jokeapi.dev/"
    const val JOKE_TYPE_SINGLE = "single"
    const val JOKE_TYPE_TWO_PART = "twopart"

    fun log(str : String){
        Log.i("Jokes",str)
    }

}