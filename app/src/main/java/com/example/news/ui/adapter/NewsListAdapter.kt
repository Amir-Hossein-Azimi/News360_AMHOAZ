package com.example.news.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.news.R
import com.example.news.model.NewsModel
import com.example.news.model.football_model.PostModel
import com.example.news.ui.listener.NewsListListener
import kotlinx.android.synthetic.main.item_news_list.view.*

class NewsListAdapter (var listItem : List<PostModel>, val listener : NewsListListener ):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var layout = LayoutInflater.from(parent.context).inflate(R.layout.item_news_list,parent,false)
        return NewsListViewHolder(layout)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NewsListViewHolder).bindData(listItem[position] , listener)

    }

    override fun getItemCount(): Int {
        return listItem.size
    }
   inner class NewsListViewHolder(val itemView : View) : RecyclerView.ViewHolder(itemView){
           fun bindData(item:PostModel , listener : NewsListListener){
               itemView.tv_news_list_title.text = item.title
               itemView.tv_news_list_description.text = item.body
               itemView.iv_news_list_cover.load(item.cover)
               itemView.tv_news_list_author.text = item.author
               itemView.setOnClickListener {
                   listener.onNewsItemClicked(item)
               }
           }


   }
}