package com.example.foodorderingappkotlin.model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class OrderViewModelFactory(private val repository: OrderRepository): ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return OrderViewModel(repository) as T
    }
}