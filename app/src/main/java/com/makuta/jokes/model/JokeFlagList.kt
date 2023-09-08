package com.makuta.jokes.model

data class JokeFlagList(
    val error       : Boolean,
    val flags       : List<String>,
    val timestamp   : Long
)
