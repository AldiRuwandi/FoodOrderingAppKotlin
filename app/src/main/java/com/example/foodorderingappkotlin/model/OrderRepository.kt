package com.example.foodorderingappkotlin.model

class OrderRepository(private  val db: OrderDatabase) {

    suspend fun insert(order: OrderItems) = db.getOrderDao().insert(order)
    suspend fun delete(order: OrderItems) = db.getOrderDao().delete(order)

    fun getAllOrders() = db.getOrderDao().getAlOrderItems()
}