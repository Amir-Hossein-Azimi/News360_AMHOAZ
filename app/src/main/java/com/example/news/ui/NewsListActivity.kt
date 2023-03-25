package com.example.news.ui

import android.os.Bundle
import android.widget.RelativeLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat.NestedScrollType
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.news.R
import com.example.news.model.DummyData
import com.example.news.model.NewsModel
import com.example.news.model.football_model.PostModel
import com.example.news.ui.adapter.NewsListAdapter
import com.example.news.ui.fragment.NewsDetailFragment
import com.example.news.ui.listener.NewsListListener
import kotlinx.android.synthetic.main.activity_news_list.*

class NewsListActivity : AppCompatActivity() , NewsListListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_list)
        setRecyclerViewData()
    }

    private fun setRecyclerViewData() {
        rv_news_list.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        //rv_news_list.adapter = NewsListAdapter(listItem = DummyData().newListSample , listener = this  )
    }

    override fun onNewsItemClicked(news_item: PostModel) {
       supportFragmentManager.beginTransaction().replace(R.id.fragment_container , NewsDetailFragment.getNewsDetailFragment(item = news_item )).addToBackStack("dd").commit()
    }
}