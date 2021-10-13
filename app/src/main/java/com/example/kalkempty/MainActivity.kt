package com.example.kalkempty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var wynik = 0//przechowywanie rezultatu działania
        var napis = wynik.toString()
        wynik = Integer.parseInt(napis)


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById<Button>(R.id.button).text.toString()
        findViewById<Button>(R.id.button).setOnClickListener {
            findViewById<Button>(R.id.button).text = "0";
        }

        findViewById<Button>(R.id.nr1).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "1"
        }
        findViewById<Button>(R.id.nr2).setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "2"
        }
    }
}