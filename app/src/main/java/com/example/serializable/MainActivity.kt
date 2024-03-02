package com.example.serializable
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editEmail = findViewById<EditText>(R.id.email)
        var editPswd = findViewById<EditText>(R.id.pswd)
        var button = findViewById<Button>(R.id.btn)

        button.setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)

            var login = Login()
            login.email = editEmail.text.toString()
            login.pswd = editPswd.text.toString()

            intent.putExtra("login", login)

            startActivity(intent)
        }
    }
}