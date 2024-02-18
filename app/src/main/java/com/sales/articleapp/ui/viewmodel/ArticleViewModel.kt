package com.sales.articleapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ArticleViewModel @Inject constructor() : ViewModel() {



    init {
        Log.d(TAG, "Init block of ArticleViewModel")
    }

    companion object{
        const val TAG = "ArticleViewModel"
    }
}