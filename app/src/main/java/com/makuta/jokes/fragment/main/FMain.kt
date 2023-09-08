package com.makuta.jokes.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.makuta.jokes.Utils.JOKE_TYPE_SINGLE
import com.makuta.jokes.core.CoreFragment
import com.makuta.jokes.databinding.FMainBinding

class FMain : CoreFragment<FMainBinding>() {

    val mainVM : VMain by viewModels()

    override fun onBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FMainBinding.inflate(inflater,container,false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnNext.setOnClickListener {
            mainVM.randomJoke()
        }
    }

    override fun onStart() {
        super.onStart()
        mainVM.jokeData.observe(this){
            if(it != null){
                binding.text.text =if(it.type == JOKE_TYPE_SINGLE)
                     it.joke
                else
                    it.setup + "\n\n" + it.delivery
            }
        }
    }


}