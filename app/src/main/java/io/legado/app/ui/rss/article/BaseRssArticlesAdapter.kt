package io.legado.app.ui.rss.article

import android.content.Context
import androidx.viewbinding.ViewBinding
import io.legado.app.base.adapter.SimpleRecyclerAdapter
import io.legado.app.data.entities.RssArticle


abstract class BaseRssArticlesAdapter<VB : ViewBinding>(context: Context, val callBack: CallBack) :
    SimpleRecyclerAdapter<RssArticle, VB>(context) {

    interface CallBack {
        val isGridLayout: Boolean
        fun readRss(rssArticle: RssArticle)
    }
}