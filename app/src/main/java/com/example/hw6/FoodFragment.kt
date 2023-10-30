package com.example.hw6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw6.databinding.FragmentFoodBinding

class FoodFragment : Fragment() {
    private lateinit var binding: FragmentFoodBinding
    private lateinit var foodList:ArrayList<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFoodBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        val foodAdapter = FoodAdapter(foodList)
        binding.rvFood.adapter = foodAdapter
    }

    private fun loadData() {
        foodList = ArrayList()
        foodList.add("Plov")
        foodList.add("manti")
        foodList.add("samsi")
        foodList.add("lagman")
        foodList.add("bishteks")
        foodList.add("kuurdak")
        foodList.add("hinkal")
        foodList.add("bulgur chorbasi")
        foodList.add("menemen")
        foodList.add("saurma")
        foodList.add("suhsi")
        foodList.add("pizza")
        foodList.add("san sebastyan")
        foodList.add("makaron")
        foodList.add("shorpo")
        foodList.add("mercimek ")
        foodList.add("pasta")
        foodList.add("fri")
        foodList.add("kazan kebab")
    }
}