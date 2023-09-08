package com.makuta.jokes.activity

import android.os.Bundle
import android.view.LayoutInflater
import com.makuta.jokes.core.CoreActivity
import com.makuta.jokes.databinding.ActivityMainBinding

class MainActivity : CoreActivity<ActivityMainBinding>() {

    override fun onBinding(inflater: LayoutInflater) =
        ActivityMainBinding.inflate(inflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}