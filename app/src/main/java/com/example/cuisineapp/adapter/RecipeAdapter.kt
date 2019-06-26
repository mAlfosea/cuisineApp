package com.example.cuisineapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cuisineapp.R
import kotlinx.android.synthetic.main.item_recipe.view.*

class RecipeAdapter(var recipes: List<Int>): RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val lineView = LayoutInflater.from(parent.context).inflate(R.layout.item_recipe, parent, false)
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
            itemView.numberText.text = recipe.toString()
        }
    }
}