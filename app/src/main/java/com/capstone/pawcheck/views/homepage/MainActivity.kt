package com.capstone.pawcheck.views.homepage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.capstone.pawcheck.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}