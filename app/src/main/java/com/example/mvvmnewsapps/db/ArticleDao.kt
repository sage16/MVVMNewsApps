package com.example.mvvmnewsapps.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mvvmnewsapps.models.Article

@Dao
interface ArticleDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun upsert (article: Article): Long

    @Query("SELECT * FROM articles")
    fun getAllArticles(): LiveData<List<Article>>

    @Delete
    suspend fun deleteArticle(article: Article)


}