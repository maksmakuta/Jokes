package com.makuta.jokes.model

data class JokeEndpoint(
    val name        : String,
    val description : String,
    val usage       : JokeEndpointUsage
)
