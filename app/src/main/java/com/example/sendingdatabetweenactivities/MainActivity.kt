package com.example.sendingdatabetweenactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var editName : TextInputEditText
    lateinit var editEmail : TextInputEditText
    lateinit var editPhone : TextInputEditText
    lateinit var buttonSignup : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editName = findViewById(R.id.editTextName)
        editEmail = findViewById(R.id.editTextEmail)
        editPhone = findViewById(R.id.editTextPhone)
        buttonSignup = findViewById(R.id.buttonSignUp)

        buttonSignup.setOnClickListener {

            val name = editName.text.toString()
            val email = editEmail.text.toString()
            val phone = editPhone.text.toString().toLong()

            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("name",name)
            intent.putExtra("email",email)
            intent.putExtra("phone",phone)

            startActivity(intent)

        }

    }
}