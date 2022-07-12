package com.example.activitewsandlists

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.activitewsandlists.adapter.DaysOfWeekAdapter

class MainActivity : AppCompatActivity() {
    val data = listOf(
        "Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<RecyclerView>(R.id.list)
        val adapter = DaysOfWeekAdapter(data)
        list.adapter = adapter
    }
}