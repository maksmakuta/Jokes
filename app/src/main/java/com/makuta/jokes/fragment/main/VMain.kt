package com.makuta.jokes.fragment.main

import androidx.lifecycle.MutableLiveData
import com.makuta.jokes.Utils.log
import com.makuta.jokes.core.CoreViewModel
import com.makuta.jokes.model.Joke
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking

class VMain : CoreViewModel() {

    val jokeData = MutableLiveData<Joke?>()

    fun randomJoke(){
        runBlocking (Dispatchers.Default){
            backend().getJoke("Any").let {
                if(it.isSuccessful){
                    jokeData.postValue(it.body())
                }else{
                    log("response code : ${it.code()}")
                }
            }
        }
    }

}