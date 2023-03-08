package com.example.widgetspinner

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.example.widgetspinner.R.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val spinnerChoice : Spinner = findViewById( id.spinner)
        var list_of_items = arrayOf("coffee", "tea" , "milo")

        //create an arrayadapter using a simple spinner layout
        val aa = ArrayAdapter( this, android.R.layout.simple_spinner_item, list_of_items)
        //set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //set adapter to spinner
        spinnerChoice!!.setAdapter(aa)
    }
}