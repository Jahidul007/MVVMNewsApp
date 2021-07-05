package com.androiddevs.mvvmnewsapp.data.model


import com.androiddevs.mvvmnewsapp.data.model.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)