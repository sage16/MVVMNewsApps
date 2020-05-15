package com.example.mvvmnewsapps.db

import androidx.room.TypeConverter

class Converters {
    @TypeConverter
    fun fromSource(source: com.example.mvvmnewsapps.models.Source): String{
        return source.name

    }

    @TypeConverter
    fun toSource(name: String): com.example.mvvmnewsapps.models.Source {
        return com.example.mvvmnewsapps.models.Source(name, name)
    }

}