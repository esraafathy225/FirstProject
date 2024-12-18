package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    lateinit var btConfirm : Button
    lateinit var tvHello: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btConfirm = findViewById(R.id.btn_confirm)

        tvHello = findViewById(R.id.tv_hello)

        btConfirm.setOnClickListener {
            tvHello.text = "Clicked!"
        }

    }


}
