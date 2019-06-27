package com.example.cuisineapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecipeDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView (R.layout.activity_recipe_detail)

        var intent = Intent(this, RecipeDetail::class.java)
       // var name = findViewById<TextView>("+id/receipeText")
       // getExtraData()

    }


}
