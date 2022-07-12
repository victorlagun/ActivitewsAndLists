package com.example.activitewsandlists.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.activitewsandlists.R
import kotlinx.android.synthetic.main.item_list.view.*

class DaysOfWeekAdapter(private val daysOfWeek: List<String>) :
    RecyclerView.Adapter<DaysOfWeekAdapter.DaysOfWeekViewHolder>() {

    class DaysOfWeekViewHolder(layout: ConstraintLayout) : RecyclerView.ViewHolder(layout)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaysOfWeekViewHolder {
        val itemList = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false) as ConstraintLayout
        return DaysOfWeekViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: DaysOfWeekViewHolder, position: Int) {
        holder.itemView.textView.text = daysOfWeek[position]
    }

    override fun getItemCount() = daysOfWeek.size
}