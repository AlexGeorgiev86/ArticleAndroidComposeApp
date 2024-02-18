package com.sales.articleapp

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class ArticleApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "coming_inside_onCreate")
    }

    companion object{
        const val TAG = "ArticleApplication"
    }
}