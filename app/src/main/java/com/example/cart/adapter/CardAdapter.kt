package com.example.cart.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.cart.R
import com.example.cart.model.MyCart
import kotlinx.android.synthetic.main.cart_list.view.*

class MyCartAdapter(var myCartList:ArrayList<MyCart>): RecyclerView.Adapter<MyCartAdapter.MyCartViewHolder>(){
    inner class MyCartViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        fun bindMyCart(myCart:MyCart){
            itemView.itemImage.setImageResource(myCart.itemImage)
            itemView.txtItemName.text=myCart.name
            itemView.itemPrice.text=myCart.price.toString()
            itemView.discountPrice.text=myCart.discount.toString()
            itemView.itemWeight.text=myCart.weight
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCartViewHolder {
        return MyCartViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cart_list,parent,false))
    }

    override fun getItemCount(): Int {
        return myCartList.size
    }

    override fun onBindViewHolder(holder: MyCartViewHolder, position: Int) {
        holder.bindMyCart(myCartList[position])
    }

}