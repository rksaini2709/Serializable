package com.example.serializable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var homePageActivity = findViewById<TextView>(R.id.home_page_text)

        intent?.let{
            var login = it.getSerializableExtra("login") as Login

            homePageActivity.text = "${login.email} and ${login.pswd}"
        }
    }
}