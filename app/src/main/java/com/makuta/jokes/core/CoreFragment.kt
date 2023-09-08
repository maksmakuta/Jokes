package com.makuta.jokes.core

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class CoreFragment<VB : ViewBinding> : Fragment() {

    lateinit var binding : VB

    abstract fun onBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) : VB

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = onBinding(inflater,container)
        return binding.root
    }

}