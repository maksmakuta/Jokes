package com.makuta.jokes.model

data class JokePing(
    val error       : Boolean,
    val ping        : String,
    val timestamp   : Long
)
