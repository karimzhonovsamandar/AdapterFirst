package com.example.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.adapter.adapter.FruitsAdapter
import com.example.adapter.fruits.ConstructorFruits
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val fruits = ArrayList<ConstructorFruits>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 0..10){
            fruits.add(ConstructorFruits(R.drawable.banana_icon_icons_com_68789,"Banana"))
            fruits.add(ConstructorFruits(R.drawable.apple_fruit_food_icon_218349,"Apple"))
        }



        recyclerView.adapter = FruitsAdapter(this,fruits)


        

    }
}