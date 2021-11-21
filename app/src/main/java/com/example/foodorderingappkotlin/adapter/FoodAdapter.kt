package com.example.foodorderingappkotlin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingappkotlin.R
import com.example.foodorderingappkotlin.activity.DetailActivity
import com.example.foodorderingappkotlin.model.FoodData
import kotlinx.android.synthetic.main.view_food.view.*
import java.util.*

class FoodAdapter(var food: List<FoodData>): RecyclerView.Adapter<FoodAdapter.myViewHolder>() {

    class myViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var title = view.food_title
        var food_image = view.food_img
        var toko_name = view.toko_name
        var distance = view.distance
        var order = view.order
        var price = view.price
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_food, parent, false)
        return myViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        var dummyImage: Int? = null
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, DetailActivity::class.java)
            intent.putExtra("food", food[position])
            intent.putExtra("foodImg", dummyImage)
            holder.itemView.context.startActivity(intent)
        }
        holder.title.text = food[position].title
        holder.toko_name.text = food[position].market
        holder.distance.text = food[position].jarak
        holder.order.text = food[position].order

        when(food[position].title!!.lowercase(Locale.getDefault())){
            "pizza italiano" -> {
                dummyImage = R.drawable.pizza
            }
            "chicken wings" -> {
                dummyImage = R.drawable.chicken
            }
            "fish cake" -> {
                dummyImage = R.drawable.fish_cake
            }
            "hamburger us" -> {
                dummyImage = R.drawable.hamburger
            }
            "red velvet" -> {
                dummyImage = R.drawable.red_velvet
            }
            "kebab turkey" -> {
                dummyImage = R.drawable.kebab
            }
            "french fries" -> {
                dummyImage = R.drawable.french_fries
            }
            "dimsum" -> {
                dummyImage = R.drawable.dimsum
            }
            "tacos" -> {
                dummyImage = R.drawable.tacos
            }
            "spaghetti" -> {
                dummyImage = R.drawable.spaghetti
            }
        }
        holder.food_image.setImageResource(dummyImage!!)
        holder.price.text = food[position].price
    }

    override fun getItemCount(): Int {
        return food.size
    }

}