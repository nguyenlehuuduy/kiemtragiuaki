package com.example.nguyenlehuuduy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nguyenlehuuduy.data.Information
import com.example.nguyenlehuuduy.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.login.setOnClickListener{

            val name =binding.edtName.text.toString()
            val sdt = binding.edtSodienthoai.text.toString()

            val information = Information(name, sdt )

            MainActivity.Informationn.add(information)

            finish()
        }
    }
}