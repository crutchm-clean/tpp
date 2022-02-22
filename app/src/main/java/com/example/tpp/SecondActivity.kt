package com.example.tpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val data = intent?.getStringExtra("key")
        tw2.text = data ?: "oooops"
        button2.setOnClickListener{
            onClick()
        }
    }


    fun onClick(){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}