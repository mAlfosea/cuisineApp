package com.example.cuisineapp.model

import android.content.Context
import com.google.gson.Gson

object DataManager {

    var dataRecipe: Array<Recipe> = arrayOf()

    fun initWithJSONFile(file: String = "", context: Context) {
        if (file !== "" && dataRecipe.count() == 0) {
            // Init Gson
            val gson = Gson()
            // Fetch assets
            val assetManager = context.assets
            val input = assetManager.open(file)
            // Init buff & get Array<Recipe> from my JSON
            val bufferedReader = input.bufferedReader()
            val inputString = bufferedReader.readText()
            dataRecipe = gson.fromJson(inputString, Array<Recipe>::class.java)
        }
    }
}