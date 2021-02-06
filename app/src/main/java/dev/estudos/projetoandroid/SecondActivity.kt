package dev.estudos.projetoandroid

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        title = "Second Activity"

        val btnFinish = findViewById<Button>(R.id.activity_second_btn)

        btnFinish.setOnClickListener {
            Toast.makeText(
                this,
                "Essa activity será finalizada. Obrigado!!",
                Toast.LENGTH_LONG
            )
                .show()
            this.finish()
        }

        val btnChangeText = findViewById<Button>(R.id.activity_second_btn_change_text)

        btnChangeText.setOnClickListener {
            Toast.makeText(
                this,
                "Changing the text!!",
                Toast.LENGTH_LONG
            )
                .show()

            val tv = findViewById<TextView>(R.id.activity_second_tv_to_change)

//            tv.text = """Currently date and time ${LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"))}"""
            tv.text = getString(
                R.string.second_activity_new_text,
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"))
            )
            tv.setTextColor(ContextCompat.getColor(this, R.color.black))
        }
    }
}