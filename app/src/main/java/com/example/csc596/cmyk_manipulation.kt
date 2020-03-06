package com.example.csc596

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_cmyk_manipulation.*

class cmyk_manipulation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cmyk_manipulation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        cmyk_manipulation.text = "CMYK Manip"
    }

}
