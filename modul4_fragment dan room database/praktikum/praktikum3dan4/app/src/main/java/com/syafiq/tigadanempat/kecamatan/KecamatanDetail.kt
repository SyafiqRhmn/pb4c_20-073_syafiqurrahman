package com.syafiq.tigadanempat.kecamatan

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.syafiq.tigadanempat.R

class KecamatanDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_detail_kecamatan)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail Kecamatan"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val tName  = intent.getStringExtra(EXTRA_NAME)


        tvSetName.text = tName
    }

    companion object {
        const val EXTRA_NAME = "extra_name"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}