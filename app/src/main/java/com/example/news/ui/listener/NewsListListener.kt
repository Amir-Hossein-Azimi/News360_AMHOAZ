package com.example.news.ui.listener

import com.example.news.model.NewsModel
import com.example.news.model.football_model.PostModel

interface NewsListListener {
    fun onNewsItemClicked(news_item: PostModel)
}