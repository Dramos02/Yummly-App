package com.finalproj.yummly

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.finalproj.yummly.databinding.FoodItemBinding

class FoodAdapter(private var foodList: List<Food>) : RecyclerView.Adapter<FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = FoodItemBinding.inflate(inflater, parent, false)

        return FoodViewHolder(binding)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setFilteredList(foodList : List<Food>) {
        this.foodList = foodList
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val menuContext = holder.itemView.context

        holder.bind(foodList[position])
        with(holder) {
            val name = foodBinding.foodNameTxt.text.toString()

            foodBinding.foodImgBtn.setOnClickListener {
                Toast.makeText(menuContext, name, Toast.LENGTH_SHORT).show()
                val intent = Intent(menuContext, RecipeScreen::class.java)
                intent.putExtra("foodName", name)
                menuContext.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
    //Copyrights © https://github.com/kurut0dev
}
