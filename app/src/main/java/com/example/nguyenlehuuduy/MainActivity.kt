package com.example.nguyenlehuuduy

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nguyenlehuuduy.data.Information
import com.example.nguyenlehuuduy.data.InformationAdapter
import com.example.nguyenlehuuduy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ListInformation.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)
            adapter = InformationAdapter(Informationn)
        }

        binding.Add.setOnClickListener{
            val intent = Intent(this@MainActivity,Login::class.java)
            startActivity(intent)

        }
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        binding.ListInformation.adapter?.notifyDataSetChanged()
    }

    companion object {
        val Informationn = mutableListOf<Information>()
    }
}