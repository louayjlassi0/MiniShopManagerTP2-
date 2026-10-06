package com.example.tp2louay

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // --- TP Code: Bouton Suivant ---
        val btnSuivant = findViewById<Button>(R.id.btnSuivant)
        btnSuivant.setOnClickListener {
            Toast.makeText(this, "Bouton clique !", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
        }   
        // --------------------------------

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}