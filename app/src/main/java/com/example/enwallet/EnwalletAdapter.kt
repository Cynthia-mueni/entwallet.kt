package com.example.enwallet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter(val enwalletList: List<Enwallet>):RecyclerView.Adapter<EnwalletViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnwalletViewHolder {
        var itemView =LayoutInflater.from(parent.context).inflate(R.layout.enwallet_list_item, parent, false)
        return EnwalletViewHolder(itemView)
}
    override fun getItemCount(): Int {
        return enwalletList.size
    }
    override fun onBindViewHolder(holder: EnwalletViewHolder, position: Int) {
        val enwallet = enwalletList[position]
        holder.tvTransaction.text = enwallet.transaction
        holder.tvBalance.text = enwallet.amount
        holder.tvIncome.text = enwallet.date

    }

}

class EnwalletViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvTransaction = itemView.findViewById<TextView>(R.id.tvSalary)
    var tvBalance= itemView.findViewById<TextView>(R.id.tvAmount)
    var tvIncome = itemView.findViewById<TextView>(R.id.tvDate)

}