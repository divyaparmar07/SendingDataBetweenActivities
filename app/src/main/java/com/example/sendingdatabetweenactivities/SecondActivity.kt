package com.example.sendingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Phone
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var txtname : TextView
    lateinit var txtemail : TextView
    lateinit var txtphone: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        txtname = findViewById(R.id.textViewName)
        txtemail = findViewById(R.id.textViewEmail)
        txtphone = findViewById(R.id.textViewPhone)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val phone = intent.getLongExtra("phone",0)

        txtname.text = "Hello $name"
        txtemail.text = "Your email is $email"
        txtphone.text = "Your phone number is $phone"

    }
}