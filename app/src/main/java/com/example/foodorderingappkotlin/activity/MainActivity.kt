package com.example.foodorderingappkotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodorderingappkotlin.R
import com.example.foodorderingappkotlin.adapter.FoodAdapter
import com.example.foodorderingappkotlin.model.setFoodData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        window.decorView.apply { systemUiVisibility =
//            View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN}

        my_recycler.adapter = FoodAdapter(setFoodData.setFoods())
        my_recycler.layoutManager = LinearLayoutManager(this)
    }
}