package com.finalproj.yummly

import androidx.recyclerview.widget.RecyclerView
import com.finalproj.yummly.databinding.FoodItemBinding

class FoodViewHolder(val foodBinding: FoodItemBinding) : RecyclerView.ViewHolder(foodBinding.root) {
    fun bind(food:Food) {
        foodBinding.foodNameTxt.text = food.name
        foodBinding.foodImgBtn.setImageResource(food.img)
    }
    //Copyrights © https://github.com/kurut0dev
}
