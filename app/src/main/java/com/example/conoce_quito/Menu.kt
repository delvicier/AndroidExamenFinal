package com.example.conoce_quito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val boton0 = findViewById<Button>(R.id.empezar)

        boton0.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val boton1 = findViewById<ImageButton>(R.id.img1)

        boton1.setOnClickListener {
            startActivity(Intent(this, Ubicacion1::class.java))
        }

        val boton2 = findViewById<ImageButton>(R.id.img2)

        boton2.setOnClickListener {
            startActivity(Intent(this, Ubicacion2::class.java))
        }

        val boton3 = findViewById<ImageButton>(R.id.img3)

        boton3.setOnClickListener {
            startActivity(Intent(this, Ubicacion3::class.java))
        }
    }
}