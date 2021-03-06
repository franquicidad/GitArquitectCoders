package com.example.gitarquitectcoders

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitarquitectcoders.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)

        with(binding) {
            arquitectText.text = "First issue on GitHub on a new branch"
            arquitectText.textSize = 22F
        }


    }
}