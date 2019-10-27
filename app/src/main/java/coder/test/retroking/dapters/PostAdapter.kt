package coder.test.retroking.dapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.test.retroking.R
import coder.test.retroking.models.Post
import kotlinx.android.synthetic.main.post_row.view.*
import org.jetbrains.anko.toast

class PostAdapter(val context:Context,val posts : List<Post>)
    : RecyclerView.Adapter<PostAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.post_row,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int  = posts.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val post = posts[position]

        holder.itemView.tvUserId.text = post.userId.toString()
        holder.itemView.tvPostId.text = post.id.toString()
        holder.itemView.tvTitle.text = post.title
        holder.itemView.tvBody.text = post.body

        holder.itemView.tvBody.setOnClickListener {
            context.toast(post.title)
        }


    }

    class ViewHolder(item:View) : RecyclerView.ViewHolder(item)
}