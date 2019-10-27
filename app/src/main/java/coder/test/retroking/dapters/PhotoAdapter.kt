package coder.test.retroking.dapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coder.test.retroking.R
import coder.test.retroking.models.Photo
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.photo_row.view.*

class PhotoAdapter(val context: Context, val photos: List<Photo>) :
    RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(context).inflate(R.layout.photo_row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int = photos.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val photo = photos[position]

        Picasso.get().load(photo.url).into(holder.itemView.productImg)

    }

    class ViewHolder(item: View) : RecyclerView.ViewHolder(item)
}