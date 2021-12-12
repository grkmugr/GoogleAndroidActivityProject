package com.example.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var image: ImageView
    lateinit var button: Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        image = findViewById<ImageView>(R.id.image)
        button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        button.setOnClickListener{
            Toast.makeText(this,"buton'a tıklandı",Toast.LENGTH_LONG).show()
            randomsayiuret()
        }
    }

    fun randomsayiuret(){
        Log.d("görkem","randomsayiüret fonksiyonu calışır")
        var randomSayi = (1..6).random()

        zariGoster(randomSayi)
    }
    fun zariGoster(number:Int){
        when(number){
            1->image.setImageResource(R.drawable.dice_1)
            2->image.setImageResource(R.drawable.dice_2)
            3->image.setImageResource(R.drawable.dice_3)
            4->image.setImageResource(R.drawable.dice_4)
            5->image.setImageResource(R.drawable.dice_5)
            6->image.setImageResource(R.drawable.dice_6)
        }
    }
}