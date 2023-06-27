package com.kotlinseries.foodmenu

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var adapter:FoodAdapter?=null



    var listOffoods = ArrayList<Foods>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Load foods
        listOffoods.add(Foods("coffee","Coffee is prepared from brewed at elgon",R.drawable.coffee_pot))
        listOffoods.add(Foods("Honey","Coffee is prepared from brewed at elgon",R.drawable.honey))
        listOffoods.add(Foods("eppresso","Coffee is prepared from brewed at elgon",R.drawable.espresso))
        listOffoods.add(Foods("sugarcubes","Coffee is prepared from brewed at elgon",R.drawable.sugar_cubes))
        listOffoods.add(Foods("coffee","Coffee is prepared from brewed at elgon",R.drawable.french_fries))
        listOffoods.add(Foods("cappucino","Coffee is prepared from brewed at elgon",R.drawable.coffee_pot))
        adapter=FoodAdapter(this,listOffoods)

        //Assign our list the gridview id
        findViewById<GridView>(R.id.gvlistfoods)

    }




}

class FoodAdapter(context: Context, listOfood: ArrayList<Foods>) : BaseAdapter() {
    var listOffood =ArrayList<Foods>()
    var context:Context?=null
    override fun getCount(): Int {
        return listOffood.size
    }

    override fun getItem(position: Int): Any {
        return listOffood[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var food =this.listOffood[position]
        var inflator = context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater
        var foodview =inflator.inflate(R.layout.food_ticket,null)
        foodview.findViewById<ImageView>(R.id.ivfood).setImageResource(food.image!!)
        foodview.setOnClickListener{
val intent = Intent(context,fooddetails::class.java)
            intent.putExtra("name",food.name!!)
            intent.putExtra("des",food.des!!)
            intent.putExtra("image",food.image!!)
            context!!.startActivity(intent) }
            foodview.findViewById<TextView>(R.id.tvNAME).text = food.name!!
            return foodview

        }



    }




