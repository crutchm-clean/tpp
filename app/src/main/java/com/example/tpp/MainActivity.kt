package com.example.tpp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{
            onClickListener()
        }


    }

    fun onClickListener(){
        val text = ET.text.toString()
        if(text.isEmpty()) {
            Toast.makeText(this, "please write text", Toast.LENGTH_SHORT).show()
        } else{
            val inten = Intent(this, SecondActivity::class.java).apply {
               putExtra("key", text)
            }
            startActivity(inten)

        }
    }
}