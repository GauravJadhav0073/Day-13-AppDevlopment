package com.example.day13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val tvorder = findViewById<TextView>(R.id.tVorder)
        val order =intent.getStringExtra(MainActivity.KEY)

        tvorder.text = "Order Placed for \n " + order.toString()
    }
}