package com.example.adapter.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.adapter.R
import com.example.adapter.fruits.ConstructorFruits
import kotlinx.android.synthetic.main.item_rv.view.*

class FruitsAdapter(val context:Context, val fruitsList: ArrayList<ConstructorFruits>): RecyclerView.Adapter<FruitsAdapter.Vh>() {
    inner class Vh(var itemRv: View) : RecyclerView.ViewHolder(itemRv) {
        fun onBind(item: ConstructorFruits) {
            itemRv.rvImageView.setImageResource(item.imageView)
            itemRv.rvTextView.text = item.textView
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(fruitsList[position])
    }

    override fun getItemCount(): Int = fruitsList.size

}