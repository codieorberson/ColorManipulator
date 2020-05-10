package com.example.csc596

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView

class rgb_add_sub : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Creates objects used on page

        val view: View = inflater.inflate(R.layout.fragment_rgb_add_sub, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar1)
        val seek2 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar2)
        val seek3 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar3)
        val seek4 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar4)
        val seek5 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar5)
        val seek6 = view.findViewById<SeekBar>(R.id.rgb_addsub_seekbar6)

        val seekText1 = view.findViewById<TextView>(R.id.rgbseekbaraddsubtext1)
        val seekText2 = view.findViewById<TextView>(R.id.rgbseekbaraddsubtext2)
        val seekText3 = view.findViewById<TextView>(R.id.rgbseekbaraddsubtext3)
        val seekText4 = view.findViewById<TextView>(R.id.rgbseekbaraddsubtext4)
        val seekText5 = view.findViewById<TextView>(R.id.rgbseekbaraddsubtext5)
        val seekText6 = view.findViewById<TextView>(R.id.rgbseekbaraddsubtext6)

        val box1 = view.findViewById<View>(R.id.rgb_addorsub_box1)
        val box2 = view.findViewById<View>(R.id.rgb_addorsub_box2)

        val hexcode1 = view.findViewById<TextView>(R.id.rgbaddsubhexcode1)
        val hexcode2 = view.findViewById<TextView>(R.id.rgbaddsubhexcode2)


        //All of the comments added to seekbar 1 apply to other seekbars!!


        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {

                //Updates boxes and seekbar text as sliders manipulated
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                update_seekbars_progress(arrayOf(seek4, seek5, seek6, seek1, seek2, seek3))
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))

                //Makes sure label next to seekbar displays the correct numbers and doesn't go past boundaries
                if(seek1.progress < 10) {
                    seekText1.setPadding(((1.505 * seek1.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                    seekText4.setPadding(((1.505 * seek4.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                }
                else if(seek1.progress < 100) {
                    seekText1.setPadding(((1.505 * seek1.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                    seekText4.setPadding(((1.505 * seek4.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                }
                else {
                    seekText1.setPadding(((1.561 * seek1.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)
                    seekText4.setPadding(((1.561 * seek4.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)
                }
                seekText1.text = seek1.progress.toString()
                seekText4.text = seek4.progress.toString()

                //Updates hexcode based on slider movement
                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
                update_hexcode(hexcode2, arrayOf(seek4, seek5, seek6))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
                //Allows user to touch and manipulate slider
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
                //Stops manipulating slider when no touch
            }
        })

        seek2?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                update_seekbars_progress(arrayOf(seek4, seek5, seek6, seek1, seek2, seek3))
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))

                if(seek2.progress < 10) {
                    seekText2.setPadding(((1.505 * seek2.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                    seekText5.setPadding(((1.505 * seek5.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                }
                else if(seek2.progress < 100) {
                    seekText2.setPadding(((1.505 * seek2.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                    seekText5.setPadding(((1.505 * seek5.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                }
                else {
                    seekText2.setPadding(((1.561 * seek2.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)
                    seekText5.setPadding(((1.561 * seek5.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)
                }
                seekText2.text = seek2.progress.toString()
                seekText5.text = seek5.progress.toString()

                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
                update_hexcode(hexcode2, arrayOf(seek4, seek5, seek6))
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
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                update_seekbars_progress(arrayOf(seek4, seek5, seek6, seek1, seek2, seek3))
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))

                if(seek3.progress < 10) {
                    seekText3.setPadding(((1.505 * seek3.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                    seekText6.setPadding(((1.505 * seek6.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                }
                else if(seek3.progress < 100) {
                    seekText3.setPadding(((1.505 * seek3.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                    seekText6.setPadding(((1.505 * seek6.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                }
                else {
                    seekText3.setPadding(((1.561 * seek3.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)
                    seekText6.setPadding(((1.561 * seek6.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)
                }
                seekText3.text = seek3.progress.toString()
                seekText6.text = seek6.progress.toString()

                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
                update_hexcode(hexcode2, arrayOf(seek4, seek5, seek6))
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
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
                update_seekbars_progress(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6))
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))

                if(seek4.progress < 10) {
                    seekText4.setPadding(((1.505 * seek4.progress.toFloat() + 75)).toInt(), 0, 0, 0)
                    seekText1.setPadding(((1.505 * seek1.progress.toFloat() + 90)).toInt(), 0, 0, 0)
                }
                else if(seek4.progress < 100) {
                    seekText4.setPadding(((1.505 * seek4.progress.toFloat() + 70)).toInt(), 0, 0, 0)
                    seekText1.setPadding(((1.505 * seek1.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }
                else {
                    seekText4.setPadding(((1.561 * seek4.progress.toFloat() + 64.87)).toInt(), 0, 0, 0)
                    seekText1.setPadding(((1.561 * seek1.progress.toFloat() + 79.87)).toInt(), 0, 0, 0)
                }
                seekText4.text = seek4.progress.toString()
                seekText1.text = seek1.progress.toString()

                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
                update_hexcode(hexcode2, arrayOf(seek4, seek5, seek6))
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
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
                update_seekbars_progress(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6))
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))

                if(seek5.progress < 10) {
                    seekText5.setPadding(((1.505 * seek5.progress.toFloat() + 75)).toInt(), 0, 0, 0)
                    seekText2.setPadding(((1.505 * seek2.progress.toFloat() + 90)).toInt(), 0, 0, 0)
                }
                else if(seek5.progress < 100) {
                    seekText5.setPadding(((1.505 * seek5.progress.toFloat() + 70)).toInt(), 0, 0, 0)
                    seekText2.setPadding(((1.505 * seek2.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }
                else {
                    seekText5.setPadding(((1.561 * seek5.progress.toFloat() + 64.87)).toInt(), 0, 0, 0)
                    seekText2.setPadding(((1.561 * seek2.progress.toFloat() + 79.87)).toInt(), 0, 0, 0)
                }
                seekText5.text = seek5.progress.toString()
                seekText2.text = seek2.progress.toString()

                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
                update_hexcode(hexcode2, arrayOf(seek4, seek5, seek6))
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
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
                update_seekbars_progress(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6))
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))

                if(seek6.progress < 10) {
                    seekText6.setPadding(((1.505 * seek6.progress.toFloat() + 75)).toInt(), 0, 0, 0)
                    seekText3.setPadding(((1.505 * seek3.progress.toFloat() + 90)).toInt(), 0, 0, 0)
                }
                else if(seek6.progress < 100) {
                    seekText6.setPadding(((1.505 * seek6.progress.toFloat() + 70)).toInt(), 0, 0, 0)
                    seekText3.setPadding(((1.505 * seek3.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }
                else {
                    seekText6.setPadding(((1.561 * seek6.progress.toFloat() + 64.87)).toInt(), 0, 0, 0)
                    seekText3.setPadding(((1.561 * seek3.progress.toFloat() + 79.87)).toInt(), 0, 0, 0)
                }
                seekText6.text = seek6.progress.toString()
                seekText3.text = seek3.progress.toString()

                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
                update_hexcode(hexcode2, arrayOf(seek4, seek5, seek6))
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

    fun update_seekbars_progress(seekBars: Array<SeekBar>) {
        //Updates text to correctly display slider position

        seekBars[0].progress = 255 - seekBars[3].progress
        seekBars[1].progress = 255 - seekBars[4].progress
        seekBars[2].progress = 255 - seekBars[5].progress
    }

    fun update_hexcode(hexcode: TextView, seekBars: Array<SeekBar>) {
        //Changes RGB value to correct hexcode

        var hexcodevalue = "#"
        for(i in seekBars){
            if(i.progress.toString().length == 1){
                hexcodevalue += "0"
                hexcodevalue += (i.progress.toString(16))
            }
            else{
                hexcodevalue += (i.progress.toString(16))
            }
        }
        hexcode.text = hexcodevalue
    }

}
