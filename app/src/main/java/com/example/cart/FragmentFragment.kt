package com.example.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cart.adapter.MyCartAdapter
import com.example.cart.model.MyCart
import kotlinx.android.synthetic.main.fragment_fragment.view.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root = inflater.inflate(R.layout.fragment_fragment, container, false)
        var myCartArray = ArrayList<MyCart>()
        myCartArray.add(MyCart(R.drawable.fine_grain_sugar,"Fine Grain Sugar",10,20.00,"1 Kg"))
        myCartArray.add(MyCart(R.drawable.peanuts,"Peanuts",10,20.00,"3 Kg"))
        myCartArray.add(MyCart(R.drawable.dawat_rice,"Dawat Rice",10,80.00,"2 Kg"))

        var myCartAdapter = MyCartAdapter(myCartArray)
        root.recyclerView.layoutManager = LinearLayoutManager(context)
        root.recyclerView.adapter = myCartAdapter

        return root
    }

}
