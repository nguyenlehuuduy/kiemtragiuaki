package com.example.nguyenlehuuduy.data

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InformationAdapter (
    private val ListInformation:List<Information>
) : RecyclerView.Adapter<InformationViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = InformationViewHolder.from(parent)

    override fun onBindViewHolder(holder: InformationViewHolder, position: Int) {
            holder.bind(ListInformation[position])
        }

    override fun getItemCount() = ListInformation.size

}