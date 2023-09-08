package com.makuta.jokes.model

data class JokesCategories(
    val error : Boolean,
    val categories: List<String>,
    val categoryAliases: List<JokeCategoryAlias>,
    val timestamp : Long
)
