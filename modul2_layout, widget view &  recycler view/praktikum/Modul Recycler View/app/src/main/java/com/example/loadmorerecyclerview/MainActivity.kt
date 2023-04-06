package com.example.loadmorerecyclerview

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.loadmorerecyclerview.LinearRecyclerView.LinearRecyclerViewActivity
import com.example.loadmorerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.linearRvBtn.setOnClickListener {
            val intent = Intent(this,
                LinearRecyclerViewActivity::class.java)
            startActivity(intent)
        }


    }

}