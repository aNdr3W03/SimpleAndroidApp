package com.andrew.simpleandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvNuclears: RecyclerView
    private var list: ArrayList<Nuclear> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvNuclears = findViewById(R.id.rv_nuclears)
        rvNuclears.setHasFixedSize(true)

        list.addAll(NuclearsData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvNuclears.layoutManager = LinearLayoutManager(this)
        val listNuclearAdapter = ListNuclearAdapter(list)
        rvNuclears.adapter = listNuclearAdapter
    }

    private fun showRecyclerGrid() {
        rvNuclears.layoutManager = GridLayoutManager(this, 2)
        val gridHeroAdapter = GridNuclearAdapter(list)
        rvNuclears.adapter = gridHeroAdapter
    }

    private fun showRecyclerCardView() {
        rvNuclears.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewNuclearAdapter(list)
        rvNuclears.adapter = cardViewHeroAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.mode_list -> {
                showRecyclerList()
            }

            R.id.mode_grid -> {
                showRecyclerGrid()
            }

            R.id.mode_cardview -> {
                showRecyclerCardView()
            }
        }
    }
}
