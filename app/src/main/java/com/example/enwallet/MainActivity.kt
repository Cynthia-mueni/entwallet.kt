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
        displaInfo()


    }

    fun displaInfo(){
        fun displayInfo(){

            var  enwallet1= Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

            var  enwallet2= Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")
4
            var  enwallet3= Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

            var enwallet4= Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

            var enwallet5 = Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

            var enwallet6= Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000","kes 4000","kes 3000","kes 4000","kes 5000")

            var enwallet7= Enwallet("kes 4500","kes4000","kes 400","kes 4500","kes 40000",




            val enwalletList = listOf(enwallet1,enwallet2,enwallet3,enwallet4,enwallet5,enwallet6,enwallet7)
            val enwalletAdapter = EnwalletAdapter(enwalletList )
            binding.rvEnwallet.adapter = enwalletAdapter


        }
    }


