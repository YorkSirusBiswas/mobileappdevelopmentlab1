//Code for revert
package com.example.mobileappdevelopmentlab1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<LinearLayout>(R.id.mainLayout)
        val tvDisplay = findViewById<TextView>(R.id.tvDisplay)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)
        val btnChangeBg = findViewById<Button>(R.id.btnChangeBg)

        btnChangeText.setOnClickListener {
            tvDisplay.text = "Hello from MADT Lab 1!"
        }

        btnChangeColor.setOnClickListener {
            tvDisplay.setTextColor(Color.RED)
        }

        btnChangeBg.setOnClickListener {
            mainLayout.setBackgroundColor(Color.LTGRAY)
        }
    }
}