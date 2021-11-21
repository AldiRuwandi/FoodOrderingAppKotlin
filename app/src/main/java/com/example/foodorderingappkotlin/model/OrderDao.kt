package com.example.foodorderingappkotlin.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface OrderDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(order: OrderItems)

    @Delete
    suspend fun delete(order: OrderItems)

    @Query("SELECT * FROM order_items")
    fun getAlOrderItems(): LiveData<List<OrderItems>>
}