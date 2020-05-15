package com.example.mvvmnewsapps.api

import com.example.mvvmnewsapps.util.Constants.Companion.BASE_URL
import com.google.android.play.core.splitinstall.c
import com.google.gson.Gson
import okhttp3.logging.HttpLoggingInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitInstance {
    companion object{


        private val retrofit by lazy {
            val logging = HttpLoggingInterceptor()
            logging.setLevel(HttpLoggingInterceptor.Level.BODY)
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()


        }
        val  api by lazy {
            retrofit.create(NewsApi::class.java)
        }
    }
}
