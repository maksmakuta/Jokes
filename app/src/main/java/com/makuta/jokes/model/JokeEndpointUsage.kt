package com.makuta.jokes.model

data class JokeEndpointUsage(
    val method          : String,
    val url             : String,
    val supportedParams : List<String>
)
