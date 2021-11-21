package com.example.foodorderingappkotlin.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [OrderItems::class], version = 1)
abstract class OrderDatabase: RoomDatabase() {

    abstract fun getOrderDao(): OrderDao

    companion object{
        @Volatile
        private var instance: OrderDatabase? = null
        private var LOCK = Any()

        operator fun invoke(context: Context) = instance?: synchronized(LOCK){
            instance?: createDatabase(context).also {
                instance = it
            }
        }

        private fun createDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            OrderDatabase::class.java,
            "Order.db"
        ).build()
    }
}