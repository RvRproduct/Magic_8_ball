package com.example.magic8ball

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val answer = answer()

        val response: TextView = findViewById(R.id.responseView)
        response.text = answer
        val responseClear: TextView = findViewById(R.id.responseclearView)
        responseClear.text = answer
        val inner: ImageView = findViewById(R.id.innerView)
        inner.setImageResource(R.drawable.inner_8_fin)


        AgainButton()
    }
    private fun answer(): String {
        val response = Response()
        return response.randomResponse()
    }

    fun AgainButton() {
        val againButton: Button = findViewById(R.id.againView)
        againButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }

}

class Response() {
    fun randomResponse(): String {
        val options = (1..4).random()
        var response = ""

        when (options) {
            1 -> response = "Yes"
            2 -> response = "No"
            3 -> response = "Maybe"
            4 -> response = "Try \n Again"


        }
        return response
    }
}
