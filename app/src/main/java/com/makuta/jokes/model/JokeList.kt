package com.makuta.jokes.model

data class JokeList(
    val error   : Boolean,
    val jokes   : List<Joke>,
    val amount  : Int
)
