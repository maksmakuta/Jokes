package com.makuta.jokes.model

data class JokesInfoDetails(
    val totalCount : Int,
    val categories : List<String>,
    val flags: List<String>,
    val types : List<String>,
    val submissionURL : String,
    val idRange : Map<String,Array<Int>>,
    val safeJokes : List<JokesInfoSafe>
)
