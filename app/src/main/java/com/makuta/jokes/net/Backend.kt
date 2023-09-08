package com.makuta.jokes.net

import com.makuta.jokes.Utils.JOKE_API
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Backend private constructor() {

    private var backend : JokeBackend? = null

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(JOKE_API)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        backend = retrofit.create(JokeBackend::class.java)
    }

    fun getService() = backend!!

    companion object{
        fun getInstance() : Backend{
            return Backend()
        }
    }

}