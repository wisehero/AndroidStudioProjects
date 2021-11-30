package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
//            toast.show()
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
            rollDice()
        }
    }

    private fun rollDice() {
        // Create New Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

        // Update the screen with the dice roll
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)
    }

    class Dice(val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}

