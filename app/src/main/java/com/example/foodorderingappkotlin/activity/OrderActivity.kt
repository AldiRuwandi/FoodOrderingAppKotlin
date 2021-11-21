package com.example.foodorderingappkotlin.activity

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.foodorderingappkotlin.R
import com.example.foodorderingappkotlin.adapter.OrderAdapter
import com.example.foodorderingappkotlin.model.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_order.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class OrderActivity : AppCompatActivity(), OrderAdapter.OrderItemClickInterface {

    lateinit var itemsRV: RecyclerView
    lateinit var addFAB: FloatingActionButton
    lateinit var list: ArrayList<OrderItems>
    lateinit var orderAdapter: OrderAdapter
    lateinit var orderViewModel: OrderViewModel
    var orderID = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        itemsRV = findViewById(R.id.RVItems)
        addFAB = findViewById(R.id.FABAdd)
        list = ArrayList<OrderItems>()
        orderAdapter = OrderAdapter(list, this)
        itemsRV.layoutManager = LinearLayoutManager(this)
        itemsRV.adapter = orderAdapter
        val orderRepository = OrderRepository(OrderDatabase(this))
        val factory = OrderViewModelFactory(orderRepository)
        orderViewModel = ViewModelProvider(this, factory).get(OrderViewModel::class.java)
        orderViewModel.getAllOrderItems().observe(this, Observer {
            orderAdapter.list = it as ArrayList<OrderItems>
            orderAdapter.notifyDataSetChanged()
        })

        addFAB.setOnClickListener {
            openDialog()
        }
    }

    fun openDialog(){
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.order_dialog)
        val cancelBtn = dialog.findViewById<Button>(R.id.BtnCancel)
        val addBtn = dialog.findViewById<Button>(R.id.BtnAdd)
        val itemEdt = dialog.findViewById<EditText>(R.id.EditItemName)
        val itemPriceEdt = dialog.findViewById<EditText>(R.id.EditItemPrice)
        val itemQuantityEdt = dialog.findViewById<EditText>(R.id.EditItemQuantity)
        cancelBtn.setOnClickListener {
            dialog.dismiss()
        }

        addBtn.setOnClickListener {
            val itemName: String = itemEdt.text.toString()
            val itemPrice: String = itemPriceEdt.text.toString()
            val itemQuantity: String = itemQuantityEdt.text.toString()
            val qty: Int = itemQuantity.toInt()
            val pr: Int = itemPrice.toInt()
            if (itemName.isNotEmpty() && itemPrice.isNotEmpty() && itemQuantity.isNotEmpty()){
                val sdf = SimpleDateFormat("dd MMM, yyyy - HH:mm")
                val currentDate: String = sdf.format(Date())
                val items = OrderItems(itemName, qty, pr, currentDate)
                items.id = orderID
                orderViewModel.insert(items)
                Toast.makeText(applicationContext, "Item Inserted...", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }else{
                Toast.makeText(applicationContext, "Please enter all the data...", Toast.LENGTH_SHORT).show()
            }
        }
        dialog.show()
    }

    override fun onItemClick(orderItems: OrderItems) {
        orderViewModel.delete(orderItems)
        orderAdapter.notifyDataSetChanged()
        Toast.makeText(applicationContext, "Item Deleted...", Toast.LENGTH_SHORT).show()
    }
}