package com.dpcode.rollthedice

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
@SuppressLint("StaticFieldLeak")
lateinit var ivDice :ImageView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ivDice= findViewById(R.id.ivDice)
        val btnRoll = findViewById<Button>(R.id.btnRoll)

        btnRoll.setOnClickListener {
            Toast.makeText(this, "Dice Rolled!!", Toast.LENGTH_SHORT).show()
            rollTheDice()
        }
    }

    private fun rollTheDice() {
        ivDice.setImageResource(
            when((1..6).random()){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
        )

    }
}