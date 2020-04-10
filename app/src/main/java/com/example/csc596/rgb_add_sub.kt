package com.example.csc596

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import kotlinx.android.synthetic.main.fragment_rgb_add_sub.*

class rgb_add_sub : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_rgb_add_sub, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar1)
        val seek2 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar2)
        val seek3 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar3)
        val seek4 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar4)
        val seek5 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar5)
        val seek6 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar6)

        val box1 = view.findViewById<View>(R.id.rgb_addorsub_box1)
        val box2 = view.findViewById<View>(R.id.rgb_addorsub_box2)

        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                seek4.progress = 255 - seek1.progress
                seek5.progress = 255 - seek2.progress
                seek6.progress = 255 - seek3.progress
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
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
                seek4.progress = 255 - seek1.progress
                seek5.progress = 255 - seek2.progress
                seek6.progress = 255 - seek3.progress
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
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
                seek4.progress = 255 - seek1.progress
                seek5.progress = 255 - seek2.progress
                seek6.progress = 255 - seek3.progress
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
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
                seek1.progress = 255 - seek4.progress
                seek2.progress = 255 - seek5.progress
                seek3.progress = 255 - seek6.progress
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
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
                seek1.progress = 255 - seek4.progress
                seek2.progress = 255 - seek5.progress
                seek3.progress = 255 - seek6.progress
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
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
                seek1.progress = 255 - seek4.progress
                seek2.progress = 255 - seek5.progress
                seek3.progress = 255 - seek6.progress
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
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
