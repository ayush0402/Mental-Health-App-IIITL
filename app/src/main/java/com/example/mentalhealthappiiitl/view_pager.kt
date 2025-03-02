package com.example.mentalhealthappiiitl

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.mentalhealthappiiitl.databinding.ActivityMainBinding
import com.example.mentalhealthappiiitl.databinding.FragmentViewPagerBinding
import me.relex.circleindicator.CircleIndicator3

class view_pager : Fragment() {

     lateinit var binding: FragmentViewPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding= FragmentViewPagerBinding.inflate(inflater, container, false)


        val fragmentlist= arrayListOf(
            first(),
            second(),
            third()

        )
        val myadapter=viewpageradapter(
            fragmentlist,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.adapter=myadapter
        binding.circle.setViewPager(binding.viewPager)


        return binding.root
    }


}