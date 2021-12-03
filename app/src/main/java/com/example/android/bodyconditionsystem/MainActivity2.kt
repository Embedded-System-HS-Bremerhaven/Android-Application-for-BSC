package com.example.android.bodyconditionsystem

import CustomAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        

            val ss: String? = intent.getStringExtra("Value")

        if(ss != null){
            initRecyclerView(ss.toInt())
        }



    }

    private fun initRecyclerView(value: Int) {
        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.bcv_recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)
        val data = ArrayList<ItemsViewModel>()

        for (i in 1..30) {
            data.add(ItemsViewModel( value*i,i,"Normal" ))
        }
        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}




