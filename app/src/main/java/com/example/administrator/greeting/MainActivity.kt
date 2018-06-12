package com.example.administrator.greeting

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displayInfo()
    }

    fun displayInfo() {
        buttonGo.setOnClickListener{
            var name = editName.text
            var email = editEmail.text

            textView3.setText("HELLO" + name + "! YOUR EMAIL IS " +  email )
        }
    }
}
