package com.syafiq.tigadanempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.syafiq.tigadanempat.about.About
import com.syafiq.tigadanempat.kecamatan.Kecamatan
import com.syafiq.tigadanempat.kecamatan.KecamatanAdapter
import com.syafiq.tigadanempat.kecamatan.KecamatanData

class MainActivity : AppCompatActivity() {
    private lateinit var rvKecamatan: RecyclerView
    private var list: ArrayList<Kecamatan> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Kecamatan"

        rvKecamatan = findViewById(R.id.rv_academy)
        rvKecamatan.setHasFixedSize(true)

        list.addAll(KecamatanData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKecamatan.layoutManager = LinearLayoutManager(this)
        val academyAdapter = KecamatanAdapter(list)
        rvKecamatan.adapter = academyAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.miCompose -> {
                val iAbout = Intent(this@MainActivity,
                    About::class.java)
                startActivity(iAbout)
            }
        }
    }
}