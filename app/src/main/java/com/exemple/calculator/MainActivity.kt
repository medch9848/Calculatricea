package com.example.calculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.num1)
        val num2 = findViewById<EditText>(R.id.num2)
        val result = findViewById<TextView>(R.id.result)
        val addBtn = findViewById<Button>(R.id.addBtn)

        addBtn.setOnClickListener {

            val n1 = num1.text.toString().toDoubleOrNull() ?: 0.0
            val n2 = num2.text.toString().toDoubleOrNull() ?: 0.0

            result.text = "النتيجة: ${n1 + n2}"
        }
    }
}
