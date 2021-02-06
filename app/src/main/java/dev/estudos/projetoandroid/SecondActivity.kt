package dev.estudos.projetoandroid

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val btnFinalizar = findViewById<Button>(R.id.activity_second_btn)

        btnFinalizar.setOnClickListener {
            Toast.makeText(
                this,
                "Essa activity será finalizada. Obrigado!!",
                Toast.LENGTH_LONG
            )
                .show()
            this.finish()
        }
    }
}