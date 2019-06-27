package com.example.cuisineapp.homePage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cuisineapp.R
import com.example.cuisineapp.adapter.RecipeAdapter
import com.example.cuisineapp.model.DataManager
import kotlinx.android.synthetic.main.activity_show_all_recipes.*

class HomeActivity : AppCompatActivity() {

    var recipeList: List<Int> = listOf(1, 2, 3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_show_all_recipes)
        DataManager.initWithJSONFile("begin_json.json", this)
        ui_viewResult.layoutManager = GridLayoutManager(this, 3)
        ui_viewResult.adapter = RecipeAdapter(DataManager.dataRecipe)
    }
}
