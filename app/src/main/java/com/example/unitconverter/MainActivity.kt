package com.example.unitconverter

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.unitconverter.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun convertToKm(view: View){
        val isEmpty = binding.miles.text.toString()
        var mi = binding.miles.text.toString().toDouble()
        val miConverter: converter= converter()
        var km = miConverter.convertMiles(mi)
        if(isEmpty.trim() !=""){
            Toast.makeText(applicationContext,"Converted", Toast.LENGTH_LONG).show()
            binding.miles.text.clear()
            binding.klicks.setText(km.toString())
        }else{
            Toast.makeText(applicationContext,"Miles cannot be blank", Toast.LENGTH_LONG).show()
        }
    }

}

