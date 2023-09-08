package com.makuta.jokes.model

data class JokesInfo(
    val error : Boolean,
    val version: String,
    val jokes : JokesInfoDetails,
    val formats: List<String>,
    val jokeLanguages : Int,
    val systemLanguages: Int,
    val info: String,
    val timestamp : Long
)
