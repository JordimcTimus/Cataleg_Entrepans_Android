package com.jordimundam.catalegentrepans

import Adapter
import Item
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview: RecyclerView = findViewById(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)



        // ArrayList of class ItemsViewModel
        val data = ArrayList<Item>()

        // This loop will create 20 Views containing
        // the image with the count of view
        data.add(Item(R.drawable.entrepa1, "Entrepa 1", "Preu: 7.49€"))
        data.add(Item(R.drawable.entrepa2, "Entrepa 2", "Preu: 6.99€"))
        data.add(Item(R.drawable.entrepa3, "Entrepa 3", "Preu: 8.49€"))
        data.add(Item(R.drawable.entrepa4, "Entrepa 4", "Preu: 7.99€"))
        data.add(Item(R.drawable.entrepa5, "Entrepa 5", "Preu: 6.49€"))
        data.add(Item(R.drawable.entrepa6, "Entrepa 6", "Preu: 7.49€"))
        data.add(Item(R.drawable.entrepa7, "Entrepa 7", "Preu: 7.45€"))
        data.add(Item(R.drawable.entrepa8, "Entrepa 8", "Preu: 7.33€"))
        data.add(Item(R.drawable.entrepa9, "Entrepa 9", "Preu: 6.99€"))
        data.add(Item(R.drawable.entrepa10, "Entrepa 10", "Preu: 8.49€"))


        // This will pass the ArrayList to our Adapter
        val adapter = Adapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}