package com.example.nguyenlehuuduy.data

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nguyenlehuuduy.databinding.IteminformationBinding


class InformationViewHolder private constructor(
    private val binding:IteminformationBinding,

    ) : RecyclerView.ViewHolder(binding.root){
        companion object {
            fun from(parent: ViewGroup) :InformationViewHolder {
                val binding = IteminformationBinding.inflate(LayoutInflater.from(parent.context),parent,false)
                return InformationViewHolder(binding)
            }
        }

    fun bind(information:Information){
        binding.name.text = information.name1
        binding.sodienthoai.text = information.sodienthoai1
    }

}