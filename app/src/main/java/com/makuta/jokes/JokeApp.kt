package com.makuta.jokes

import android.app.Application
import com.makuta.jokes.Utils.log

class JokeApp : Application() {

    override fun onCreate() {
        super.onCreate()
        log("JokeApp::onCreate()")
    }

}