
package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.simplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)


        binding.conv.setOnClickListener  {
            var result = (binding.input.text.toString().toFloat() - 32)/9*5
            binding.print.text = result!!.toString()
        }



    }
}