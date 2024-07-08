package com.example.enwallet

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class EnwalletAdapter(val enwalletList: List<Enwallet>):RecyclerView.Adapter<EnwalletViewHolde> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EnwalletViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.enwallet_list_item,parent,false)
        return EnwalletViewHolder((itemView))

}

    override fun onBindViewHolder(holder: EnwalleteViewHolder, position: Int) {
        val article = enwalletList[position]
        holder.tvMoney.text = enwallet.money
        holder.tv.text = enwalletList
        holder.Link .text=article.link
        holder.tvTitle.text = article.title
        holder
    }
