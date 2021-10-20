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

        var  liczbaPierwsza = 0
        var liczbaDruga = 0


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //findViewById<Button>(R.id.button).text.toString()
        findViewById<Button>(R.id.button).setOnClickListener {
            //findViewById<Button>(R.id.button).text = "0";
        }

        findViewById<TextView>(R.id.textView).text =""

        findViewById<Button>(R.id.PlusButton).setOnClickListener {
            liczbaPierwsza = findViewById<TextView>(R.id.textView).text.toString().toInt()
            //wynik = Integer.parseInt(napis)
            findViewById<TextView>(R.id.textView).text = ""
        }
        findViewById<Button>(R.id.wynikButton).setOnClickListener {
            liczbaDruga = findViewById<TextView>(R.id.textView).text.toString().toInt()
            wynik = liczbaPierwsza + liczbaDruga
            findViewById<TextView>(R.id.textView).text = wynik.toString()
        }

        findViewById<Button>(R.id.nr1).setOnClickListener {
            findViewById<TextView>(R.id.textView).text =
                findViewById<TextView>(R.id.textView).text.toString() + "1"
        }
        findViewById<Button>(R.id.nr2).setOnClickListener {
            findViewById<TextView>(R.id.textView).text =
                findViewById<TextView>(R.id.textView).text.toString() + "2"
        }
    }
}