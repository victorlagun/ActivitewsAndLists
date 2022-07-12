package com.example.activitewsandlists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.activitewsandlists.adapter.DaysOfWeekAdapter
import com.example.activitewsandlists.model.ItemModel

class MainActivity : AppCompatActivity() {
    private val data = listOf(
        ItemModel("Monday", false),
        ItemModel("Tuesday", true),
        ItemModel("Wednesday", false),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<RecyclerView>(R.id.list)
        val adapter = DaysOfWeekAdapter(data)
        list.adapter = adapter
    }
}