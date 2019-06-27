package com.example.cuisineapp.adapter


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.cuisineapp.R
import com.example.cuisineapp.model.Recipe
import kotlinx.android.synthetic.main.cellview.view.*



class RecipeAdapter(var recipes: Array<Recipe>): RecyclerView.Adapter<RecipeAdapter.ViewHolder>() {
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
        fun bindRecipe(recipe: Recipe) {

            var assetMan = view.context.assets

            with (recipe) {

                var idRes:Int = 0
                when (recipe_picture) {
                    "a.jpg" -> idRes = R.drawable.a
                    "b.jpg" -> idRes = R.drawable.b
                    "c.jpg" -> idRes = R.drawable.c
                    "d.jpg" -> idRes = R.drawable.d
                    "e.jpg" -> idRes = R.drawable.e
                    "f.jpg" -> idRes = R.drawable.f
                    else -> idRes = 0
                }

                itemView.recipeText.text = recipe_name
                itemView.recipeImage.setImageResource(idRes)
            }
        }
    }
}