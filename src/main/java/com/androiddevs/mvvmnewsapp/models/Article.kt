package com.androiddevs.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import java.io.Serializable


@Entity(
    tableName = "articles"
)
data class Article(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String = "https://img.etimg.com/thumb/msid-83835293,width-1070,height-580,imgsize-294197,overlay-ettech/photo.jpg"
): Serializable