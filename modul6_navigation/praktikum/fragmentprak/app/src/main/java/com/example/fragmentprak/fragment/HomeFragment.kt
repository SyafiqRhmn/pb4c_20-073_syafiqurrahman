package com.example.fragmentprak.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentprak.R
import com.example.fragmentprak.adapter.PostAdapter
import com.example.fragmentprak.database.Post
import com.google.gson.Gson


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, parent: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_home, parent, false)

        val activity = activity as Context

        val postViewList = view.findViewById<RecyclerView>(R.id.rvGejalaPenyakit)

        postViewList.layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        val postJSON: String = activity.assets.open("post.json").bufferedReader().use { it.readText() }

        val post = Gson().fromJson(postJSON, Array<Post>::class.java)

        val postList = ArrayList<Post>()


        for (j in 0 until post.size)
            postList.add(Post(post[j].id, post[j].name))


        val postAdapter = PostAdapter(postList)
        postViewList.adapter = postAdapter

        return view
    }
}