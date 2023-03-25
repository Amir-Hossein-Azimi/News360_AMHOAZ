package com.example.news.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import coil.load
import com.example.news.R
import com.example.news.model.NewsModel
import com.example.news.model.football_model.PostModel
import kotlinx.android.synthetic.main.fragment_news_detail.*

class NewsDetailFragment : Fragment(R.layout.fragment_news_detail),View.OnClickListener {
    // var newsDetailItem : NewsModel? = null

    companion object{
        var newsDetailItem : PostModel? = null
        fun getNewsDetailFragment(item: PostModel) : NewsDetailFragment{

            newsDetailItem = item
            return NewsDetailFragment()
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        iv_news_detail_back.setOnClickListener(this)

        tv_news_detail_description.text = newsDetailItem?.body
        tv_news_detail_title.text = newsDetailItem?.title
        iv_news_detail_cover.load(newsDetailItem?.cover)
    }

    override fun onClick(view: View?) {
        when(view){
            iv_news_detail_back -> activity?.onBackPressed()
        }
    }
}
