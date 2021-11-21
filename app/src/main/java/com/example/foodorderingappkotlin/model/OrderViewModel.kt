package com.example.foodorderingappkotlin.model

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class OrderViewModel(private val repository: OrderRepository): ViewModel() {

    fun insert(orders: OrderItems) = GlobalScope.launch {
        repository.insert(orders)
    }

    fun delete(orders: OrderItems) = GlobalScope.launch {
        repository.delete(orders)
    }

    fun getAllOrderItems() = repository.getAllOrders()
}