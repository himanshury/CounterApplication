package com.example.counterapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val counterTextView= findViewById<TextView>(R.id.CounterTV)
        val counterButton= findViewById<Button>(R.id.button)

        counterButton.setOnClickListener()
        {
            counter++
            counterTextView.text = ""+counter
        }
    }
}