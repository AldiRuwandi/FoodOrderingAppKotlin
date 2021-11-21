package com.example.foodorderingappkotlin.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "order_items")
data class OrderItems(

    @ColumnInfo(name = "itemName")
    var itemName: String,

    @ColumnInfo(name = "itemQuantity")
    var itemQuantity: Int,

    @ColumnInfo(name = "itemPrice")
    var itemPrice: Int,

    @ColumnInfo(name = "timeStamp")
    var timeStamp: String
){
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
