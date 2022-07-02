package com.example.fabonaccisequence

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fabonaccisequence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fabonacciNumbers()

    }
    fun fabonacciNumbers(){
        val n = 50
        var i1 =0
        var i2= 1

        print("First $n terms: ")
         var numberList= mutableListOf<Int>()
        for (i in 1..n){
            numberList.add(i1)

            var sum= i1 + i2
            i1 =i2
            i2 = sum

            var numberAdapter = NumberRecyclerViewAdapter(numberList)
            binding.rvNumbers.layoutManager = LinearLayoutManager(this)
            binding.rvNumbers.adapter =numberAdapter
        }
    }
}