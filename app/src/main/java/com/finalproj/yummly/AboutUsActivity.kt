package com.finalproj.yummly

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.finalproj.yummly.databinding.ActivityAboutUsBinding

class AboutUsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAboutUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.aboutUsBodyTxt.text = "\nWelcome to PiRaCo's Yummly, the ultimate recipe app for those who are eager to learn and explore authentic Filipino cuisine!\n" +
                "\nOur app is designed to help food enthusiasts, both novice and experienced," +
                "\nto discover and create delicious Filipino dishes in the comfort of their own homes." +
                "\nWe believe that food is an integral part of any culture, and that Filipino cuisine offers a rich and " +
                "\ndiverse culinary experience that is worth exploring.\n" +
                "\nOur team of expert chefs and food bloggers has carefully curated a collection of traditional and modern Filipino recipes, ranging from classic adobo and sinigang to contemporary fusion dishes that incorporate international flavors." +
                "\nEach recipe is accompanied by step-by-step instructions, ingredient lists, and photos to guide you through the cooking process.\n" +
                "\n" +
                "\nIn addition to the recipes, our app features various tools and resources to enhance your culinary skills, including cooking tips, nutritional information, and an interactive shopping list. " +
                "\nYou can also save your favorite recipes and create personalized meal plans based on your preferences and dietary restrictions.\n" +
                "\n" +
                "\nAt PiRaCo's Yummly, we are committed to providing our users with an authentic and enjoyable culinary experience. " +
                "\nWe take pride in promoting Filipino culture and cuisine, and we hope that our app will inspire you to explore the rich flavors and traditions of the Philippines.\n" +
                "\n" +
                "Thank you for choosing PiRaCo's Yummly as your go-to recipe app for authentic Filipino cuisine!\n"
        binding.btnHome.setOnClickListener(){
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.dev1Desc.text = "\n\tKurt Robin P. Colonia\n" +
                "\n\tSoftware Developer " +
                "\n\tUI Designer" +
                "\n\tUX Designer"

        binding.dev2Desc.text = "\n\tDominic O. Ramos\n" +
                "\n\tSoftware Developer " +
                "\n\tUI Designer" +
                "\n\tUX Designer"

        binding.dev3Desc.text = "\n\tMiguel E. Pilapil\n" +
                "\n\tResource Researcher" +
                "\n\tSoftware Developer\n"
    }
    //Copyrights © https://github.com/Dramos02

}
