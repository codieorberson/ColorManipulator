package com.example.csc596

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.setPadding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_rgb_manipulation.*
import org.w3c.dom.Text

class rgb_manipulation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Creates objects used on page

        val view: View = inflater.inflate(R.layout.fragment_rgb_manipulation, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.rgbseekbar1)
        val seek2 = view.findViewById<SeekBar>(R.id.rgbseekbar2)
        val seek3 = view.findViewById<SeekBar>(R.id.rgbseekbar3)
        val seek4 = view.findViewById<SeekBar>(R.id.rgbseekbar4)
        val seek5 = view.findViewById<SeekBar>(R.id.rgbseekbar5)
        val seek6 = view.findViewById<SeekBar>(R.id.rgbseekbar6)

        val seekText1 = view.findViewById<TextView>(R.id.rgbseekbartext1)
        val seekText2 = view.findViewById<TextView>(R.id.rgbseekbartext2)
        val seekText3 = view.findViewById<TextView>(R.id.rgbseekbartext3)
        val seekText4 = view.findViewById<TextView>(R.id.rgbseekbartext4)
        val seekText5 = view.findViewById<TextView>(R.id.rgbseekbartext5)
        val seekText6 = view.findViewById<TextView>(R.id.rgbseekbartext6)

        val box1 = view.findViewById<View>(R.id.rgbbox1)
        val box2 = view.findViewById<View>(R.id.rgbbox2)

        val hexcode1 = view.findViewById<TextView>(R.id.rgbhexcode1)
        val hexcode2 = view.findViewById<TextView>(R.id.rgbhexcode2)


        //All of the comments added to seekbar 1 apply to other seekbars!!


        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {

                //Makes sure label next to seekbar displays the correct numbers and doesn't go past boundaries
                if(seek1.progress < 10)
                    seekText1.setPadding(((1.505 * seek1.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                else if(seek1.progress < 100)
                    seekText1.setPadding(((1.505 * seek1.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                else
                    seekText1.setPadding(((1.561 * seek1.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)

                //Updates slider text, box color, and hexcode as slider is manipulated
                seekText1.text = seek1.progress.toString()
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
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
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                if(seek2.progress < 10)
                    seekText2.setPadding(((1.505 * seek2.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                else if(seek1.progress < 100)
                    seekText2.setPadding(((1.505 * seek2.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                else
                    seekText2.setPadding(((1.561 * seek2.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)

                seekText2.text = seek2.progress.toString()
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
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
                if(seek3.progress < 10)
                    seekText3.setPadding(((1.505 * seek3.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                else if(seek1.progress < 100)
                    seekText3.setPadding(((1.505 * seek3.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                else
                    seekText3.setPadding(((1.561 * seek3.progress.toFloat() + 73.87)).toInt(), 0, 0, 0)

                seekText3.text = seek3.progress.toString()
                box1.setBackgroundColor(Color.rgb(seek1.progress, seek2.progress, seek3.progress))
                update_hexcode(hexcode1, arrayOf(seek1, seek2, seek3))
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
                if(seek4.progress < 10)
                    seekText4.setPadding(((1.505 * seek4.progress.toFloat() + 75)).toInt(), 0, 0, 0)
                else if(seek4.progress < 100)
                    seekText4.setPadding(((1.505 * seek4.progress.toFloat() + 70)).toInt(), 0, 0, 0)
                else
                    seekText4.setPadding(((1.561 * seek4.progress.toFloat() + 64.87)).toInt(), 0, 0, 0)

                seekText4.text = seek4.progress.toString()
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
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
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                if(seek5.progress < 10)
                    seekText5.setPadding(((1.505 * seek5.progress.toFloat() + 75)).toInt(), 0, 0, 0)
                else if(seek5.progress < 100)
                    seekText5.setPadding(((1.505 * seek5.progress.toFloat() + 70)).toInt(), 0, 0, 0)
                else
                    seekText5.setPadding(((1.561 * seek5.progress.toFloat() + 64.87)).toInt(), 0, 0, 0)


                seekText5.text = seek5.progress.toString()
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
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
            override fun onProgressChanged(seek: SeekBar,
                                           progress: Int, fromUser: Boolean) {
                if(seek6.progress < 10) {
                    seekText6.setPadding(((1.505 * seek6.progress.toFloat() + 75)).toInt(), 0, 0, 0)
                }
                else if(seek6.progress < 100)
                    seekText6.setPadding(((1.505 * seek6.progress.toFloat() + 70)).toInt(), 0, 0, 0)
                else
                    seekText6.setPadding(((1.561 * seek6.progress.toFloat() + 64.87)).toInt(), 0, 0, 0)


                seekText6.text = seek6.progress.toString()
                box2.setBackgroundColor(Color.rgb(seek4.progress, seek5.progress, seek6.progress))
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
