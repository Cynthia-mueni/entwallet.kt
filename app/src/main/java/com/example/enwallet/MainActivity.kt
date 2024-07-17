package com.example.enwallet

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvEnwallet.layoutManager = LinearLayoutManager(this)
        displayInfo()



    }

    fun displayInfo(){

            val enwallet1= Enwallet("kes 4500","kes4000","kes 400")
            val enwallet2= Enwallet("kes 4500","kes4000","kes 400")
            val enwallet3= Enwallet("kes 4500","kes4000","kes 400")
            val enwallet4= Enwallet("kes 4500","kes4000","kes 400")
            val enwallet5 = Enwallet("kes 4500","kes4000","kes 400")
            val enwallet6= Enwallet("kes 4500","kes4000","kes 400")
            val enwallet7= Enwallet("kes 4500","kes4000","kes 400")

        val wallet = listOf(enwallet1, enwallet2, enwallet3, enwallet4, enwallet5, enwallet6, enwallet7)
        val enwalletAdapter = EnwalletAdapter(wallet)
        binding.rvEnwallet.adapter = enwalletAdapter




    }

}


