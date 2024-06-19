package com.akirachix.fibinacci

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibinacci.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
       val numbers = fibonacci(100)
        binding.tvNumbers.layoutManager = LinearLayoutManager(this)

        val numbersAdapter= NumbersRecyclerViewAdapter(numbers)
        binding.tvNumbers.adapter= numbersAdapter

    }
    fun fibonacci(n: Int):List<Int>{
        val  numbers = mutableListOf(0,1)
        while (numbers.size<n){
            numbers.add(numbers[numbers.lastIndex] + numbers[numbers.lastIndex -1])
        }
        return numbers
    }

}