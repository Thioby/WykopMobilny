package io.github.feelfreelinux.wykopmobilny.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import io.github.feelfreelinux.wykopmobilny.R
import io.github.feelfreelinux.wykopmobilny.models.dataclass.Author
import io.github.feelfreelinux.wykopmobilny.models.dataclass.Entry
import io.github.feelfreelinux.wykopmobilny.models.dataclass.Link
import io.github.feelfreelinux.wykopmobilny.ui.adapters.viewholders.CommentViewHolder
import io.github.feelfreelinux.wykopmobilny.ui.adapters.viewholders.EntryViewHolder
import io.github.feelfreelinux.wykopmobilny.ui.adapters.viewholders.LinkCommentViewHolder
import io.github.feelfreelinux.wykopmobilny.ui.adapters.viewholders.LinkViewHolder

class LinkDetailsAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        private const val HEADER_HOLDER = 0
        private const val COMMENT_HOLDER = 1
    }

    var link: Link? = null

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        if (holder?.itemViewType == HEADER_HOLDER) {
            (holder as LinkViewHolder).bindView(link!!)
        } else {
            val comment = link!!.comments[position - 1]
            (holder as LinkCommentViewHolder).bindView(comment)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) HEADER_HOLDER
        else COMMENT_HOLDER
    }

    override fun getItemCount(): Int {
        link?.comments?.let {
            return it.size + 1
        }
        return 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            HEADER_HOLDER -> LinkViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.link_layout, parent, false))
            else -> LinkCommentViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.link_comment_layout, parent, false))
        }
    }
}