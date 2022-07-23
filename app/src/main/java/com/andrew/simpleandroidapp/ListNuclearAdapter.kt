package com.andrew.simpleandroidapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListNuclearAdapter(private val listNuclear: ArrayList<Nuclear>) : RecyclerView.Adapter<ListNuclearAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName:   TextView  = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView  = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_nuclear, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val nuclear = listNuclear[position]

        Glide.with(holder.itemView.context)
            .load(nuclear.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text   = nuclear.name
        holder.tvDetail.text = nuclear.detail
    }

    override fun getItemCount(): Int {
        return listNuclear.size
    }
}
