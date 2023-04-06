package com.example.loadmorerecyclerview.LinearRecyclerView


import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loadmorerecyclerview.Constant
import com.example.loadmorerecyclerview.R
import com.example.loadmorerecyclerview.databinding.LinearItemRowBinding
import com.example.loadmorerecyclerview.databinding.ProgressLoadingBinding

class Items_LinearRVAdapter(private var itemsCells: ArrayList<String?>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    class LoadingViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == Constant.VIEW_TYPE_ITEM) {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.linear_item_row, parent, false)
            ItemViewHolder(view)
        } else {
            val view =
                LayoutInflater.from(parent.context).inflate(R.layout.progress_loading, parent, false)
            ProgressLoadingBinding.bind(view)

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {

            } else {


            }
            LoadingViewHolder(view)
        }
    }

    override fun getItemCount(): Int {
        return itemsCells.size
    }

    override fun getItemViewType(position: Int): Int {
        return if (itemsCells[position] == null) {
            Constant.VIEW_TYPE_LOADING
        } else {
            Constant.VIEW_TYPE_ITEM
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.itemViewType == Constant.VIEW_TYPE_ITEM) {
            val binding = LinearItemRowBinding.bind(holder.itemView)

            binding.itemtextview.text = itemsCells[position]
        }
    }
}