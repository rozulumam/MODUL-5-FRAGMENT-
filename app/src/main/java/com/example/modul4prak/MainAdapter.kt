package com.example.modul3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.modul4prak.R

class MainAdapter(
    private val clubList: ArrayList<Nama>,
    private val context: Context
) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val namaClub : TextView = itemView.findViewById(R.id.tvNama)
        val gambar : ImageView = itemView.findViewById(R.id.gambarSatu)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: MainAdapter.ViewHolder, position: Int) {
        holder.namaClub.text = clubList[position].nama
        Glide.with(context)
            .load(clubList[position].image)
            .into(holder.gambar)

    }
    override fun getItemCount(): Int {
        return clubList.size
    }
}