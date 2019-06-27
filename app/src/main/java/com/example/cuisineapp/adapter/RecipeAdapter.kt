package com.example.cuisineapp.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.cuisineapp.R
import com.example.cuisineapp.RecipeDetail
import kotlinx.android.synthetic.main.cellview.view.*
import org.jetbrains.anko.startActivity
import kotlinx.android.synthetic.main.item_recipe.view.*

class RecipeAdapter(var recipes: List<Int>): RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.cellview, parent, false)
        return ViewHolder(lineView)
    }

    override fun getItemCount(): Int {
        return recipes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bindRecipe(recipes[position])
    }

    class ViewHolder (var view: View): RecyclerView.ViewHolder(view) {
        fun bindRecipe(recipe: Int) {

            itemView.recipeText.text = recipe.toString()

            itemView.setOnClickListener {
                itemView.context.startActivity<RecipeDetail>("id" to recipe)
            }
        }
    }
}