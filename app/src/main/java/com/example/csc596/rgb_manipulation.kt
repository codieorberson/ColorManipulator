package com.example.csc596

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_rgb_manipulation.*

class rgb_manipulation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_rgb_manipulation, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.rgbseekbar1)
        val seek2 = view.findViewById<SeekBar>(R.id.rgbseekbar2)
        val seek3 = view.findViewById<SeekBar>(R.id.rgbseekbar3)
        val seek4 = view.findViewById<SeekBar>(R.id.rgbseekbar4)
        val seek5 = view.findViewById<SeekBar>(R.id.rgbseekbar5)
        val seek6 = view.findViewById<SeekBar>(R.id.rgbseekbar6)

        val box1 = view.findViewById<View>(R.id.rgbbox1)
        val box2 = view.findViewById<View>(R.id.rgbbox2)

        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
                //do nothing
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped
            }
        })

        seek2?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                //do nothing
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped

            }
        })

        seek3?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                //do nothing
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped

            }
        })

        seek4?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
                //do nothing
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped

            }
        })

        seek5?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
                //do nothing
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped

            }
        })

        seek6?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
                //do nothing
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
                // write custom code for progress is stopped

            }
        })

        return view
    }
}
