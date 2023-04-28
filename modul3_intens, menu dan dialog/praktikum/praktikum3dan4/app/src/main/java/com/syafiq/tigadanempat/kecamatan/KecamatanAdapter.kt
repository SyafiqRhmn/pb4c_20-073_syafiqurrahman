package com.syafiq.tigadanempat.kecamatan

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.syafiq.tigadanempat.R


class KecamatanAdapter(val listKecamatan: ArrayList<Kecamatan>) : RecyclerView.Adapter<KecamatanAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.layout_kecamatan, viewGroup,false )
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKecamatan.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name) = listKecamatan[position]



        holder.tvName.text = name

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, KecamatanDetail::class.java)
            moveDetail.putExtra(KecamatanDetail.EXTRA_NAME, name)
            mContext.startActivity(moveDetail)
        }
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
    }

}