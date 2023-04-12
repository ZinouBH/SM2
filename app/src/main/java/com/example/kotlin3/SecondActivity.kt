package com.example.kotlin3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.util.jar.Attributes.Name

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val intent = intent
        val Name = intent.getStringExtra("name")
        val password = intent.getStringExtra("password")

     val result = findViewById<TextView>(R.id.result)
     result.text = "Username: "+Name+"\nPassword: "+password
    }
}