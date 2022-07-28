package com.example.diceapp

import android.graphics.Color
import android.graphics.Color.parseColor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thr.setOnClickListener{
            var random = Random.nextInt(1,7)
            if(random == 1){
                one.setBackgroundColor(Color.parseColor("GREY"))
                two.setBackgroundColor(Color.parseColor("GREY"))
                three.setBackgroundColor(Color.parseColor("GREY"))
                four.setBackgroundColor(Color.parseColor("GREY"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                six.setBackgroundColor(Color.parseColor("GREY"))
                seven.setBackgroundColor(Color.parseColor("GREY"))
                eight.setBackgroundColor(Color.parseColor("GREY"))
                nine.setBackgroundColor(Color.parseColor("GREY"))
                one.text = ""
                two.text = ""
                three.text = ""
                four.text = ""
                five.text = "X"
                six.text = ""
                seven.text = ""
                eight.text = ""
                nine.text = ""
            }
            if(random == 2){
                one.setBackgroundColor(Color.parseColor("GREY"))
                two.setBackgroundColor(Color.parseColor("GREY"))
                three.setBackgroundColor(Color.parseColor("GREY"))
                four.setBackgroundColor(Color.parseColor("YELLOW"))
                five.setBackgroundColor(Color.parseColor("GREY"))
                six.setBackgroundColor(Color.parseColor("YELLOW"))
                seven.setBackgroundColor(Color.parseColor("GREY"))
                eight.setBackgroundColor(Color.parseColor("GREY"))
                nine.setBackgroundColor(Color.parseColor("GREY"))
                one.text = ""
                two.text = ""
                three.text = ""
                four.text = "X"
                five.text = ""
                six.text = "X"
                seven.text = ""
                eight.text = ""
                nine.text = ""
            }
            if(random == 3){
                one.setBackgroundColor(Color.parseColor("GREY"))
                two.setBackgroundColor(Color.parseColor("GREY"))
                three.setBackgroundColor(Color.parseColor("GREY"))
                four.setBackgroundColor(Color.parseColor("YELLOW"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                six.setBackgroundColor(Color.parseColor("YELLOW"))
                seven.setBackgroundColor(Color.parseColor("GREY"))
                eight.setBackgroundColor(Color.parseColor("GREY"))
                nine.setBackgroundColor(Color.parseColor("GREY"))
                one.text = ""
                two.text = ""
                three.text = ""
                four.text = "X"
                five.text = "X"
                six.text = "X"
                seven.text = ""
                eight.text = ""
                nine.text = ""
            }
            if(random == 4){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                two.setBackgroundColor(Color.parseColor("GREY"))
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                four.setBackgroundColor(Color.parseColor("GREY"))
                five.setBackgroundColor(Color.parseColor("GREY"))
                six.setBackgroundColor(Color.parseColor("GREY"))
                seven.setBackgroundColor(Color.parseColor("YELLOW"))
                eight.setBackgroundColor(Color.parseColor("GREY"))
                nine.setBackgroundColor(Color.parseColor("YELLOW"))
                one.text = "X"
                two.text = ""
                three.text = "X"
                four.text = ""
                five.text = ""
                six.text = ""
                seven.text = "X"
                eight.text = ""
                nine.text = "X"
            }
            if(random == 5){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                two.setBackgroundColor(Color.parseColor("GREY"))
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                four.setBackgroundColor(Color.parseColor("GREY"))
                five.setBackgroundColor(Color.parseColor("YELLOW"))
                six.setBackgroundColor(Color.parseColor("GREY"))
                seven.setBackgroundColor(Color.parseColor("YELLOW"))
                eight.setBackgroundColor(Color.parseColor("GREY"))
                nine.setBackgroundColor(Color.parseColor("YELLOW"))
                one.text = "X"
                two.text = ""
                three.text = "X"
                four.text = ""
                five.text = "X"
                six.text = ""
                seven.text = "X"
                eight.text = ""
                nine.text = "X"
            }
            if(random == 6){
                one.setBackgroundColor(Color.parseColor("YELLOW"))
                two.setBackgroundColor(Color.parseColor("YELLOW"))
                three.setBackgroundColor(Color.parseColor("YELLOW"))
                four.setBackgroundColor(Color.parseColor("GREY"))
                five.setBackgroundColor(Color.parseColor("GREY"))
                six.setBackgroundColor(Color.parseColor("GREY"))
                seven.setBackgroundColor(Color.parseColor("YELLOW"))
                eight.setBackgroundColor(Color.parseColor("YELLOW"))
                nine.setBackgroundColor(Color.parseColor("YELLOW"))
                one.text = "X"
                two.text = "X"
                three.text = "X"
                four.text = ""
                five.text = ""
                six.text = ""
                seven.text = "X"
                eight.text = "X"
                nine.text = "X"
            }
            Toast.makeText(this,"You Rolled "+random, Toast.LENGTH_SHORT).show()
        }
    }
}