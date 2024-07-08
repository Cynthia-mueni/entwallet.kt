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
        holder.tvMoney.text = enwallet.money
        holder.tvMoneyout.text = enwallet.moneyout
        holder.tvBalance.text = enwallet.balance
        holder.tvBusfare.text = enwallet.busfare
        holder.tvTransaction.text = enwallet.transaction

    }

}

class EnwalletViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvMoney = itemView.findViewById<TextView>(R.id.tvMoney)
    var tvMoneyout= itemView.findViewById<TextView>(R.id.tvMoneyout)
    var tvBalance = itemView.findViewById<TextView>(R.id.tvBalance)
    var tvBusfare = itemView.findViewById<TextView>(R.id.tvBusfare)
    var tvTransaction= itemView.findViewById<TextView>(R.id.tvTransaction)
}