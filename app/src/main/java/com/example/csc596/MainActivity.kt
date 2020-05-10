package com.example.csc596

import android.graphics.Color.red
import android.graphics.Color.rgb
import com.google.android.material.tabs.TabLayout
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.viewpager.widget.ViewPager
import android.widget.TableLayout
import android.widget.Toast
import com.example.csc596.R.id.rgbseekbar1
import kotlinx.android.synthetic.main.fragment_rgb_manipulation.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Creates the menu system tabs
        val adapter = MyViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(welcome_screen(), title = " Home ")
        adapter.addFragment(rgb_manipulation(), title = " RGB Manip ")
        adapter.addFragment(cmyk_manipulation(), title = " CMYK Manip ")
        adapter.addFragment(rgb_add_sub(), title = " RGB Comp ")
        adapter.addFragment(cmyk_add_sub(), title = " CMYK Comp ")
        view_pager.adapter = adapter
        tabs.setupWithViewPager(view_pager)
    }

    class MyViewPagerAdapter(manager:FragmentManager): FragmentPagerAdapter(manager){

        //Creates all fragments
        private val fragmentList: MutableList<Fragment> = ArrayList()
        private val titleList : MutableList<String> = ArrayList()

        override fun getCount(): Int {
            return fragmentList.size
        }

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }
        fun addFragment(fragment: Fragment, title:String){
            fragmentList.add(fragment)
            titleList.add(title)
        }

        //Creates fragment title
        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }

    }
}
