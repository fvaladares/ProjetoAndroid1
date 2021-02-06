package dev.estudos.projetoandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "My Android Project"


        val btn = findViewById<Button>(R.id.activity_main_btn_message)

        btn.setOnClickListener {
            Toast.makeText(this, "Button activated :)", Toast.LENGTH_LONG).show()
        }


        val btnNewActivity = findViewById<Button>(R.id.activity_main_btn_new_activity)

        btnNewActivity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
            Toast.makeText(this, "Button 2 activated :)", Toast.LENGTH_LONG).show()
        }
    }
}