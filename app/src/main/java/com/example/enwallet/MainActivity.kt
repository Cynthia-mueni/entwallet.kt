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
            val enwallet1 = Enwallet("Abaraham",14700,"Text",15700)
            val enwallet2 = Enwallet("Abaraham",14700,"text",14700)
            val enwallet3 = Enwallet("Abaraham",14700,"text",14700)
            val enwallet4 = Enwallet("Abaraham",14700,"text",1470)
            val enwallet5 = Enwallet("Abaraham",14700,"text",14700)
            val enwallet6 = Enwallet("Abaraham",14700,"text",14700)
            val enwallet7 = Enwallet("Abaraham",14700,"text",14700)

            val enwalletList = listOf(enwallet1,enwallet2,enwallet3,enwallet4,enwallet5,enwallet6,enwallet7)
            val enwalletAdapter = EnwalletAdapter(enwalletList )
            binding.rvEnwallet.adapter = enwalletAdapter


        }
    }


