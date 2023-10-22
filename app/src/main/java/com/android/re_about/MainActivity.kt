package com.android.re_about

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_id = findViewById<TextView>(R.id.tv_id)

        if(intent.hasExtra("id")) {
            tv_id.text = "아이디 : "+ intent.getStringExtra("id")
        }

        val btn_close = findViewById<Button>(R.id.btn_close)
        btn_close.setOnClickListener{
            finish()
        }
    }
}