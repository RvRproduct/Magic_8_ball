package com.example.magic8ball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val instructionTextView: TextView = findViewById(R.id.instructionsView)
        instructionTextView.text =
            "Think of a (yes or no) question and shake the Magic 8-Ball for a response"
        val front: ImageView = findViewById(R.id.frontView)
        front.setImageResource(R.drawable.front_8_fin)

        Shake()
    }
        fun Shake(){
            val shake: Button = findViewById(R.id.shakeView)
            shake.setOnClickListener{
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
        }

        }
}

