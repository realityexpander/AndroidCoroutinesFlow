package com.realityexpander.androidcoroutinesflow.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.realityexpander.androidcoroutinesflow.model.NewsRepository

class ListViewModel: ViewModel() {

    val newsArticles = NewsRepository().getNewsArticle().asLiveData()

}