package com.example.foodorderingappkotlin.model

import android.os.Parcel
import android.os.Parcelable

data class FoodData(
    val id: Int?,
    val title: String?,
    val market: String?,
    val jarak: String?,
    val order: String?,
    val overview: String?,
    val price: String?
): Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readValue(Int::class.java.classLoader) as? Int,
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeValue(id)
        parcel.writeString(title)
        parcel.writeString(market)
        parcel.writeString(jarak)
        parcel.writeString(order)
        parcel.writeString(overview)
        parcel.writeString(price)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<FoodData> {
        override fun createFromParcel(parcel: Parcel): FoodData {
            return FoodData(parcel)
        }

        override fun newArray(size: Int): Array<FoodData?> {
            return arrayOfNulls(size)
        }
    }
}