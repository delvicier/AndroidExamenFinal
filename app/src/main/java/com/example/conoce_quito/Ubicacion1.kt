package com.example.conoce_quito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ubicacion1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion1)

        val boton1 = findViewById<Button>(R.id.empezar)

        boton1.setOnClickListener {
            startActivity(Intent(this, MapsActivity::class.java))
        }
    }
}