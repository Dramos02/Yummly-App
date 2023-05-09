package com.finalproj.yummly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.finalproj.yummly.databinding.ActivityRecipeScreenBinding

class RecipeScreen : AppCompatActivity() {

    private var ingredientList = ArrayList<String>()
    private var instructionList = ArrayList<String>()

    private lateinit var binding:ActivityRecipeScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecipeScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHomeRecipe.setOnClickListener(){
            val intent = Intent(this, MainMenuActivity::class.java)
            startActivity(intent)
        }

        setIngredientList()
        setInstructionList()

        val foodName = intent.getStringExtra("foodName")

        binding.foodName.text = foodName

        // Set the image resource based on the image name
        val imageResourceId = getImageResourceId(foodName)
        binding.imageViewr.setImageDrawable(ContextCompat.getDrawable(this, imageResourceId))
        binding.ingredientsTxtView.text = getIngredients(foodName)
        binding.instructionsTxtView.text = getInstructions(foodName)
    }

    private fun getImageResourceId(foodName: String?): Int {
        return when (foodName) {
            "Adobo" -> R.drawable.adobo // replace with the resource ID of your image
            "Bistek Tagalog" -> R.drawable.bistek_tagalog // replace with the resource ID of your image\
            "Chicken Inasal" -> R.drawable.chicken_inasal
            "Kare-kare" -> R.drawable.kare_kare
            "Lechon Kawali" -> R.drawable.lechon_kawali
            "Lumpia Shanghai" -> R.drawable.lumpia_shanghai
            "Pancit Canton" -> R.drawable.pancit_canton
            "Pinakbet" -> R.drawable.pinakbet
            "Sinigang" -> R.drawable.sinigang
            "Sisig" -> R.drawable.sisig
            else -> throw IllegalArgumentException("Invalid food name: $foodName")
        }
    }

    private fun getIngredients(foodName: String?): String {
        return when (foodName) {
            "Adobo" -> ingredientList[0]
            "Bistek Tagalog" -> ingredientList[1]
            "Chicken Inasal" -> ingredientList[2]
            "Kare-kare" -> ingredientList[3]
            "Lechon Kawali" -> ingredientList[4]
            "Lumpia Shanghai" -> ingredientList[5]
            "Pancit Canton" -> ingredientList[6]
            "Pinakbet" -> ingredientList[7]
            "Sinigang" -> ingredientList[8]
            "Sisig" ->ingredientList[9]
            else -> throw IllegalArgumentException("Invalid image name: $foodName")
        }
    }

    private fun getInstructions(foodName: String?): String {
        return when (foodName) {
            "Adobo" -> instructionList[0]
            "Bistek Tagalog" -> instructionList[1]
            "Chicken Inasal" -> instructionList[2]
            "Kare-kare" -> instructionList[3]
            "Lechon Kawali" -> instructionList[4]
            "Lumpia Shanghai" -> instructionList[5]
            "Pancit Canton" -> instructionList[6]
            "Pinakbet" -> instructionList[7]
            "Sinigang" -> instructionList[8]
            "Sisig" ->instructionList[9]
            else -> throw IllegalArgumentException("Invalid image name: $foodName")
        }
    }

    private fun setIngredientList() {
        ingredientList.add("1kg of Chicken or Pork, cut into pieces\n\n" +
                "1/2 cup of Soy Sauce\n\n" +
                "1/2 cup of Vinegar\n\n" +
                "1 Onion, chopped\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "1pc Bay Leaf\n\n" +
                "1tsp Black Peppercorns\n\n" +
                "Salt to taste\n\n" +
                "Cooking Oil")
        ingredientList.add("1kg beef sirloin, sliced thinly\n\n" +
                "1/2 cup of Soy Sauce\n\n" +
                "1/4 cup of Calamnsi Juice\n\n" +
                "1 Onion, sliced\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "Salt and Pepper to taste\n\n" +
                "Cooking Oil")
        ingredientList.add("1kg Chicken, cut into pieces\n\n" +
                "1/2 cup of Vinegar\n\n" +
                "1/4 cup of Calamansi Juice\n\n" +
                "1/4 cup of Fish Sauce\n\n" +
                "2tbsp of Brown Sugar\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "1 Onion, chopped\n\n" +
                "1tsp Turmeric Powder\n\n" +
                "Salt and Pepper to taste\n\n" +
                "Cooking Oil")
        ingredientList.add("1kg oxtail or Beef Tripe\n\n" +
                "1/2 cup of Peanut Butter\n\n" +
                "2tbsp Anatto Powder\n\n" +
                "1 Onion, chopped\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "2 Eggplants, sliced\n\n" +
                "1 Banana Blossom, sliced\n\n" +
                "1/2 cup of String Beans, cut into 2-inch pieces\n\n" +
                "2tbsp of Fish Sauce\n\n" +
                "2 cups of Water\n\n" +
                "Salt to taste\n\n" +
                "Cooking Oil")
        ingredientList.add("1kg Pork Belly\n\n" +
                "1 Onion, chopped\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "2pcs Bay Leaves\n\n" +
                "1tsp of Black Peppercorns\nv" +
                "Water" +
                "Cooking Oil")
        ingredientList.add("1/2kg Ground Pork\n\n" +
                "1/2 cup of Carrots, grated\n\n" +
                "1/2 cup of Onions, chopped\n\n" +
                "1/2 cup of Celery, chopped\n\n" +
                "1/4 cup of Soy Sauce\n\n" +
                "1pc egg\n\n" +
                "1/2tsp Ground Black Pepper\n\n" +
                "Lumpia Wrappers\n\n" +
                "Cooking Oil")
        ingredientList.add("1/2kg Pancit Canton Noodles\n\n" +
                "1/2kg Pork or Chicken, sliced thinly\n\n" +
                "1 Onion, sliced\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "1/4 cup of Soy Sauce\n\n" +
                "2tbsp Oyster Sauce\n\n" +
                "2 cups of Water\n\n" +
                "Cooking Oil")
        ingredientList.add("1/2kg Pork Belly or Shrimp\n\n" +
                "1 Eggplant, sliced\n\n" +
                "1 Bitter Gourd, sliced\n\n" +
                "1 Squash, cubed\n\n" +
                "1 Onion, chopped\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "2tbsp of Fish Sauce\n\n" +
                "1 cup of Water\n\n" +
                "Cooking Oil")
        ingredientList.add("1/2kg Pork Ribs or Fish\n\n" +
                "1 Onion, chopped\n\n" +
                "2-3 cloves of Garlic, minced\n\n" +
                "2 Tomatoes, chopped\n\n" +
                "1 Eggplant, sliced\n\n" +
                "1 Radish, sliced\n\n" +
                "1-2pcs of Tamarind Paste or Powder\n\n" +
                "2 cups of Water\n\n" +
                "Salt to taste")
        ingredientList.add("1kg Pig's Face or Belly\n\n" +
                "1 Onion, chopped\n\n" +
                "3-4 cloves of Garlic, minced\n\n" +
                "1/4 cup of Soy Sauce\n\n" +
                "1/4 cup of Vinegar\n\n" +
                "2tbsp of Calamnsi Juice\n\n" +
                "2pcs of Red Chili Pepper, chopped\n\n" +
                "Salt and Pepper to taste\n\n" +
                "Cooking Oil")
    }

    private fun setInstructionList() {
        instructionList.add("Heat cooking oil in a pan and sauté onion and garlic until golden brown.\n\n" +
                "Add chicken or pork and cook until brown on all sides.\n\n" +
                "Pour int Soy Sauce, Vinegar, Bay Leaf, and Black Peppercorns.\n\n" +
                "Bring to a boil then lower heat and let it simmer until the meat is tender and the sauce has thickened.\n\n" +
                "Season with Salt to taste.")
        instructionList.add("heat cooking oil in a pan and sauté onion and garlic until golden brown. Set aside.\n\n" +
                "In the same pan, cook the beef until browned on both sides.\n\n" +
                "Add the soy sauce and calamansi juice. Let it simmer for 10-15 minutes.\n\n" +
                "Add the sautéed onion and garlic. Season with salt and pepper to taste.")
        instructionList.add("Combine vinegar, calamansi juice, fish sauce, brown sugar, galic, onion, turmeric, powder, salt, and pepper in a bowl. Mix well.\n\n" +
                "Marinate the chicken in the mixture for at least 1 hour or overnight.\n\n" +
                "Heat the grill or grill pan and bruch with cooking oil.\n\n" +
                "Grill the chicken until cooked through and charred on both sides.")
        instructionList.add("In a pot, boil the oxtail or beef tripe in water until tender.\n\n" +
                "In a separate pan, sauté onion and garlic until fragrant.\n\n" +
                "Add the annatto powder and cook for a few minutes.\n\n" +
                "Add the peanut butter and mix well.\n\n" +
                "Pour in water and let it simmer until the sauce thickens.\n\n" +
                "Add the boiled oxtail or beef tripe, eggplants, banana blossom, string beans, and fish sauce. Simmer until the vegetables are tender.\n\n" +
                "Season with salt to taste.")
        instructionList.add("In a pot, place the pork belly, onion, garlic, bay leaves, black peppercorns, and enough water to cover the pork.\n\n" +
                "Bring to a boil and simmer until the pork is tender.\n\n" +
                "Remove the pork from the pot and let it cool.\n\n" +
                "Heat cooking oil in a pan and fry the pork until crispy and golden brown.\n\n" +
                "Serve hot with vinegar and soy sauce dip.")
        instructionList.add("In a bowl, mix the ground pork, grated carrots, chopped onions, chopped celery, soy sauce, egg, and ground black pepper.\n\n" +
                "Take a lumpia wrapper and place a spoonful of the filling on one side.\n\n" +
                "Roll the wrapper tightly and seal the edges with water.\n\n" +
                "Heat cooking oil in a pan and deep fry the lumpia until golden brown.\n\n" +
                "Drain excess oil with a paper towel.\n\n" +
                "Serve hot with sweet and sour sauce.")
        instructionList.add("Heat cooking oil in a pan.\n\n" +
                "Saute onion and garlic until fragrant.\n\n" +
                "Add the sliced pork or chicken and cook until browned.\n\n" +
                "Add soy sauce and oyster sauce. Mix well.\n\n" +
                "Add the pancit canton noodles and mix until coated with the sauce.\n\n" +
                "Pour in the water and let it simmer until the noodles are cooked and the sauce has been absorbed.\n\n" +
                "Serve hot and garnish with sliced green onions or calamansi wedges if desired.")
        instructionList.add("Heat cooking oil in a pan and sauté onion and garlic until golden brown.\n\n" +
                "Add the pork belly or shrimp and cook until browned.\n\n" +
                "Add the eggplant, bitter gourd, and squash. Cook for a few minutes.\n\n" +
                "Pour in water and fish sauce. Cover and let it simmer until the vegetables are tender.")
        instructionList.add("In a pot, sauté onion and garlic until fragrant.\n\n" +
                "Add the tomatoes and cook until soft.\n\n" +
                "Add the pork ribs or fish and cook until browned.\n\n" +
                "Pour in water and tamarind paste or powder. Bring to a boil.\n\n" +
                "Add the eggplant, radish, and green chili pepper. Simmer until the vegetables are tender.\n\n" +
                "Season with salt to taste.")
        instructionList.add("Boil the pig's face or belly in water for about 30 minutes until tender. Drain and let it cool.\n\n" +
                "Grill or broil the meat until crispy.\n\n" +
                "Chop the meat into small pieces and set aside.\n\n" +
                "In a pan, sauté onion, and garlic until golden brown.\n\n" +
                "Add the chopped meat, soy sauce, vinegar, calamansi juice, and red chili pepper. Mix well, season with salt and pepper to taste.")
    }
    //Copyrights © https://github.com/Dramos02 (Dominic O. Ramos)
    //Integrated by: https://github.com/kurut0dev  (Kurt P. Colonia)
}
