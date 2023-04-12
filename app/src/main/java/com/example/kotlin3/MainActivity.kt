package com.example.kotlin3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name4 = findViewById<EditText>(R.id.Name4)
        val Name5 = findViewById<EditText>(R.id.Name5)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val Name = Name4.text.toString()
            val password = Name5.text.toString()

            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("name",Name)
            intent.putExtra("password",password)
            startActivity(intent)
        }
    }
}