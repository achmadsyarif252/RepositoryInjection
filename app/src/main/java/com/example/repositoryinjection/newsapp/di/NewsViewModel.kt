package com.example.repositoryinjection.newsapp.di

import androidx.lifecycle.ViewModel
import com.dicoding.newsapp.data.local.entity.NewsEntity
import com.example.repositoryinjection.newsapp.data.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    fun getHeadlineNews() = newsRepository.getHeadlineNews()
    fun getBookmarkedNews() = newsRepository.getBookmarkedNews()
    fun saveNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, true)
    }

    fun deleteNews(news: NewsEntity) {
        newsRepository.setBookmarkedNews(news, false)
    }
}