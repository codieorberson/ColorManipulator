package com.example.csc596

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_rgb_manipulation.*

class rgb_manipulation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_rgb_manipulation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rgb_manipulation.text = "RGB Manip"
    }

}
