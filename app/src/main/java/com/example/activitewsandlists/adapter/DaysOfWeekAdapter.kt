package com.example.activitewsandlists.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.activitewsandlists.R
import com.example.activitewsandlists.model.ItemModel
import kotlinx.android.synthetic.main.item_first.view.*
import kotlinx.android.synthetic.main.item_second.view.*

class DaysOfWeekAdapter(private val daysOfWeek: List<ItemModel>) :
    RecyclerView.Adapter<ViewHolder>() {

    class DaysOfWeekViewHolder(layout: ConstraintLayout) : RecyclerView.ViewHolder(layout)

    class ButtonViewHolder(layout: ConstraintLayout) : RecyclerView.ViewHolder(layout)

    override fun getItemViewType(position: Int): Int {
        return if (daysOfWeek[position].isButton) {
            0
        } else {
            1
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when (viewType) {
            0 -> {
                val itemList = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_second, parent, false) as ConstraintLayout
                ButtonViewHolder(itemList)
            }
            1 -> {
                val itemList = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_first, parent, false) as ConstraintLayout
                DaysOfWeekViewHolder(itemList)
            }
            else -> {
                throw RuntimeException("Unknown viewType!")
            }
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (holder) {
            is DaysOfWeekViewHolder -> {
                holder.itemView.textView.text = daysOfWeek[position].text
            }
            is ButtonViewHolder -> {
                holder.itemView.itemButton.setOnClickListener {
                    Toast.makeText(
                        holder.itemView.context,
                        daysOfWeek[position].text,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }

    override fun getItemCount() = daysOfWeek.size
}