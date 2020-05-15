package com.example.mvvmnewsapps.models

import com.example.mvvmnewsapps.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)