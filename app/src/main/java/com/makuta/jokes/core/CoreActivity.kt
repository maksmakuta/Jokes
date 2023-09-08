package com.makuta.jokes.core

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class CoreActivity<VB : ViewBinding> : AppCompatActivity() {

    lateinit var binding: VB

    abstract fun onBinding(inflater: LayoutInflater) : VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = onBinding(layoutInflater)
        setContentView(binding.root)
    }
}