package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    //creating key
    companion object{
        const val KEY = "com.example.day13.MainActivity.KEY"

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val et1 = findViewById<EditText>(R.id.editTextTextPersonName5)
        val et2 = findViewById<EditText>(R.id.editTextTextPersonName6)
        val et3 = findViewById<EditText>(R.id.editTextTextPersonName7)
        val et4 = findViewById<EditText>(R.id.editTextTextPersonName8)

        btnOrder.setOnClickListener {
            val orderPlaced = et1.text.toString()+" "+ et2.text.toString() + " "+ et3.text.toString()+
                    " "+ et4.text.toString()

            intent = Intent(this,Order::class.java)
            intent.putExtra(KEY, orderPlaced)
            startActivity(intent)
        }

    }
}


