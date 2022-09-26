package com.example.grcboard_lapak

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2

class ViewPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)


        val viewPager : ViewPager2 = findViewById(R.id.view_PagerOnBoarding)

        val fragmentViewPager :  ArrayList<Fragment> = arrayListOf(
            PageOneOnBoardingFragment(),
            PageTwoOnBoardingFragment(),
            PagetThreeOnBoardingFragment()
        )

        val adapterViewPager = ViewPagerAdapter (fragmentViewPager,this)
        viewPager.adapter = adapterViewPager
    }
}