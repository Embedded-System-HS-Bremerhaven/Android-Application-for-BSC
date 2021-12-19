package com.example.android.bodyconditionsystem

import CustomAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Response
import retrofit2.Callback

class MainActivity2 : AppCompatActivity() {
    private val TAG = "MainActivity2"
    val data = ArrayList<Details>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ss: String? = intent.getStringExtra("Value")


        if(ss != null){
            initRecyclerView(ss)
        }

       //

    }

    private fun initRecyclerView(value: String) {
        val data = ArrayList<Details>()
        val recyclerview = findViewById<RecyclerView>(R.id.bcv_recyclerview)
        recyclerview.layoutManager = LinearLayoutManager(this)




        val call: Call<List<Details>> = ApiClient.getClient.getDetails(value)
        call.enqueue(object : Callback<List<Details>> {

            override fun onResponse(
                call: Call<List<Details>>?,
                response: Response<List<Details>>?
            ) {
                if (response != null) {
                    response.body()?.let { data.addAll(it) }

                    // This will pass the ArrayList to our Adapter
                    val adapter = CustomAdapter(data)

                    // Setting the Adapter with the recyclerview
                    recyclerview.adapter = adapter


                }
            }

            override fun onFailure(call: Call<List<Details>>?, t: Throwable?) {
                Log.e(TAG, "onFailure: ",t)
                val toast = Toast.makeText(applicationContext, "Please Check your Internet Connection",Toast.LENGTH_LONG )
                toast.show()
                finish()

            }

        })



    }


    }





