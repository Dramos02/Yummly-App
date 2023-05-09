package com.finalproj.yummly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.finalproj.yummly.databinding.ActivityMainMenuBinding
import java.util.*
import kotlin.collections.ArrayList

class MainMenuActivity : AppCompatActivity() {

    private lateinit var menuBinding:ActivityMainMenuBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView: SearchView
    private lateinit var adapter : FoodAdapter
    private var foodList = ArrayList<Food>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        menuBinding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(menuBinding.root)

        recyclerView = menuBinding.foodList
        searchView = menuBinding.foodSearch

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.isScrollbarFadingEnabled = false

        addDataToList()

        adapter = FoodAdapter(foodList)

        recyclerView.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query : String?) : Boolean {
                return false
            }

            override fun onQueryTextChange(newText : String?) : Boolean {
                filterList(newText)
                return true
            }
        })
    }

    private fun filterList(query : String?) {
        if(query != null) {
            val filteredList = ArrayList<Food>()
            for (i in foodList) {
                if(i.name.lowercase(Locale.ROOT).contains(query)) {
                    filteredList.add(i)
                }
            }
            if (filteredList.isEmpty()) {
                Toast.makeText(this, "No Data Found", Toast.LENGTH_SHORT).show()
            }
            else {
                adapter.setFilteredList(filteredList)
            }
        }
    }

    private fun addDataToList() {
        foodList.add(Food("Adobo", R.drawable.adobo))
        foodList.add(Food("Bistek Tagalog", R.drawable.bistek_tagalog))
        foodList.add(Food("Chicken Inasal", R.drawable.chicken_inasal))
        foodList.add(Food("Kare-kare", R.drawable.kare_kare))
        foodList.add(Food("Lechon Kawali", R.drawable.lechon_kawali))
        foodList.add(Food("Lumpia Shanghai", R.drawable.lumpia_shanghai))
        foodList.add(Food("Pancit Canton", R.drawable.pancit_canton))
        foodList.add(Food("Pinakbet", R.drawable.pinakbet))
        foodList.add(Food("Sinigang", R.drawable.sinigang))
        foodList.add(Food("Sisig", R.drawable.sisig))
    }
//Copyrights © https://github.com/kurut0dev
}
