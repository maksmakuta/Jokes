package com.makuta.jokes.model

data class Joke(
    val category    : String    = "",
    val type        : String    = "",
    val joke        : String    = "",
    val setup       : String    = "",
    val delivery    : String    = "",
    val flags       : JokeFlags = JokeFlags(),
    val id          : Int       = 0,
    val lang        : String    = ""
)
