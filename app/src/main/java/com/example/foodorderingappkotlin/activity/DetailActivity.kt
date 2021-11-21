
package com.example.foodorderingappkotlin.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.foodorderingappkotlin.R
import com.example.foodorderingappkotlin.model.FoodData
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    private lateinit var obj: FoodData
    private var foodImage: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

//        window.decorView.apply {
//            systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN
//        }

        obj = intent.getParcelableExtra("food")!!
        foodImage = intent.getIntExtra("foodImg", -1)
        setData(obj, foodImage!!)

        button_pesan.setOnClickListener {
            val intent = Intent(applicationContext, OrderActivity::class.java)
            startActivity(intent)
        }

    }

    private fun setData(obj: FoodData, foodImage: Int){
        title_info.text = obj.title
        market_info.text = obj.market
        order_info.text = obj.order
        distance_info.text = obj.jarak
        overview_info.text = obj.overview
        food_image_info.setImageResource(foodImage)
    }
}