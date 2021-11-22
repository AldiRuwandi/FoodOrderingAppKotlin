package com.example.foodorderingappkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingappkotlin.R
import com.example.foodorderingappkotlin.model.OrderItems

class OrderAdapter(var list: List<OrderItems>, val orderItemClickInterface: OrderItemClickInterface): RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    inner class OrderViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val nameTv = itemView.findViewById<TextView>(R.id.TVItemName)
        val quantityTv = itemView.findViewById<TextView>(R.id.TVQuantity)
        val rateTv = itemView.findViewById<TextView>(R.id.TVRate)
        val totalTv = itemView.findViewById<TextView>(R.id.TVTotalUang)
        val deleteIv = itemView.findViewById<ImageView>(R.id.IVDelete)
        val timeTV = itemView.findViewById<TextView>(R.id.TVTimeStamp)
    }

    interface OrderItemClickInterface {
        fun onItemClick(orderItems: OrderItems)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.order_items, parent, false)
        return OrderViewHolder(view)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.nameTv.text = list.get(position).itemName
        holder.quantityTv.text = list.get(position).itemQuantity.toString()
        holder.rateTv.text = "Rp." + list.get(position).itemPrice.toString()

        val itemTotal: Int = list.get(position).itemPrice *list.get(position).itemQuantity
        holder.totalTv.text = "Rp " +itemTotal.toString()
        holder.timeTV.text = "Last Update : " + list.get(position).timeStamp
        holder.deleteIv.setOnClickListener {
            orderItemClickInterface.onItemClick(list.get(position))
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
