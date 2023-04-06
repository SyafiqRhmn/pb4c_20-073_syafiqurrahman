package com.example.loadmorerecyclerview.LinearRecyclerView

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.loadmorerecyclerview.databinding.ActivityLinearRecyclerViewBinding

class LinearRecyclerViewActivity : AppCompatActivity() {

    lateinit var binding: ActivityLinearRecyclerViewBinding
    lateinit var itemsCells: ArrayList<String?>
    lateinit var loadMoreItemsCells: ArrayList<String?>
    lateinit var adapterLinear: Items_LinearRVAdapter
    lateinit var mLayoutManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //** Set the data for our ArrayList
        setItemsData()

        //** Set the adapterLinear of the RecyclerView
        setAdapter()

        //** Set the Layout Manager of the RecyclerView
        setRVLayoutManager()
    }

    private fun setItemsData() {
        itemsCells = ArrayList()
        itemsCells.add("Shape of You")
        itemsCells.add("Despacito")
        itemsCells.add("See You Again")
        itemsCells.add("Uptown Funk")
        itemsCells.add("Gangnam Style")
        itemsCells.add("Sorry")
        itemsCells.add("Sugar")
        itemsCells.add("Roar")
        itemsCells.add("Counting Stars")
        itemsCells.add("Thinking Out Loud")
        itemsCells.add("Love Yourself")
        itemsCells.add("Closer")
        itemsCells.add("Dark Horse")
        itemsCells.add("Shake It Off")
        itemsCells.add("All About That Bass")
        itemsCells.add("Radioactive")
        itemsCells.add("Blurred Lines")
        itemsCells.add("Chandelier")
        itemsCells.add("Countdown")
        itemsCells.add("Hello")
        itemsCells.add("Hotline Bling")
        itemsCells.add("Wrecking Ball")
        itemsCells.add("Cheap Thrills")
        itemsCells.add("Can't Hold Us")
        itemsCells.add("Lean On")
        itemsCells.add("Love Me Like You Do")
        itemsCells.add("Locked Out of Heaven")
        itemsCells.add("Somebody That I Used to Know")
        itemsCells.add("Bad Romance")
        itemsCells.add("Bang Bang")
        itemsCells.add("Hey, Soul Sister")
        itemsCells.add("Happy")
        itemsCells.add("Firework")
        itemsCells.add("Party Rock Anthem")
        itemsCells.add("Applause")
        itemsCells.add("Can't Stop the Feeling")
        itemsCells.add("Thrift Shop")
        itemsCells.add("Stressed Out")
        itemsCells.add("Shape of My Heart")
    }


    private fun setAdapter() {
        adapterLinear = Items_LinearRVAdapter(itemsCells)
        adapterLinear.notifyDataSetChanged()
        binding.itemsLinearRv.adapter = adapterLinear
    }

    private fun setRVLayoutManager() {
        mLayoutManager = LinearLayoutManager(this)
        binding.itemsLinearRv.layoutManager = mLayoutManager
        binding.itemsLinearRv.setHasFixedSize(true)
    }


}