package com.makuta.jokes.model

data class JokeFormats(
    val error       : Boolean,
    val formats     : List<String>,
    val timestamp   : Long
)