package com.example.bindingadaptersexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bindingadaptersexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myData = Data("Sadaqat",
            "https://www.clipartmax.com/png/middle/100-1005846_waiter-free-icon-avatar-profile-circle-png.png",
                        12)
        binding.data = myData
    }
}