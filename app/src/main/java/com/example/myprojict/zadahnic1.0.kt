package com.example.myprojict

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zadahnic)
    }
    fun button(view: View){
        var intent = Intent(this,Main2Activity::class.java)
        startActivity(intent)
    }
}
