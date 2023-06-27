package com.kotlinseries.foodmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class fooddetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fooddetails)
        val bundle = intent.extras
findViewById<ImageView>(R.id.ivfoodimage).setImageResource(bundle!!.getInt("image"))
        findViewById<TextView>(R.id.tvname).text =bundle!!.getString("name")
        findViewById<TextView>(R.id.tvdes).text =bundle!!.getString("des")

    }
}