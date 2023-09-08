package com.makuta.jokes.model

data class JokeNew(
    val formatVersion   : Int = 3,
    val category        : String,
    val type            : String,
    val joke            : String = "",
    val setup           : String = "",
    val delivery        : String = "",
    val flags           : JokeFlags,
    val lang            : String
)
