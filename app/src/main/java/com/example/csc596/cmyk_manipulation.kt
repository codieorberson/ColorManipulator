package com.example.csc596

import android.graphics.Color
import android.graphics.Color.rgb
import android.graphics.ColorSpace
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import kotlinx.android.synthetic.main.fragment_cmyk_manipulation.*



class cmyk_manipulation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_cmyk_manipulation, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar1)
        val seek2 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar2)
        val seek3 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar3)
        val seek4 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar4)
        val seek5 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar5)
        val seek6 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar6)
        val seek7 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar7)
        val seek8 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar8)

        val box1 = view.findViewById<View>(R.id.cmykbox1)
        val box2 = view.findViewById<View>(R.id.cmykbox2)

        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(rgb(255 * (1 - seek1.progress/100) * (1 - seek4.progress/100), 255 * (1 - seek2.progress/100) * ( 1 - seek4.progress/100), 255 * (1- seek3.progress/100) * (1 - seek4.progress/100)))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek2?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(rgb(255 * (1 - seek1.progress/100) * (1 - seek4.progress/100), 255 * (1 - seek2.progress/100) * ( 1 - seek4.progress/100), 255 * (1- seek3.progress/100) * (1 - seek4.progress/100)))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped
            }
        })

        seek3?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(rgb(255 * (1 - seek1.progress/100) * (1 - seek4.progress/100), 255 * (1 - seek2.progress/100) * ( 1 - seek4.progress/100), 255 * (1- seek3.progress/100) * (1 - seek4.progress/100)))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek4?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(rgb(255 * (1 - seek1.progress/100) * (1 - seek4.progress/100), 255 * (1 - seek2.progress/100) * ( 1 - seek4.progress/100), 255 * (1- seek3.progress/100) * (1 - seek4.progress/100)))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })
        return view
    }

}
