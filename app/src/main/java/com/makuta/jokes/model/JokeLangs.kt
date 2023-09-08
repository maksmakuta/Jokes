package com.makuta.jokes.model

data class JokeLangs(
    val defaultLanguage     : String,
    val jokeLanguages       : List<String>,
    val systemLanguages     : List<String>,
    val possibleLanguages   : List<JokePossibleLang>,
    val timestamp           : Long
)
