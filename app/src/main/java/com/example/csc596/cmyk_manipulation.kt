package com.example.csc596

import android.graphics.Color
import android.graphics.Color.*
import android.graphics.ColorSpace
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.fragment_cmyk_manipulation.*


class cmyk_manipulation : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Creates objects used on page

        val view: View = inflater.inflate(R.layout.fragment_cmyk_manipulation, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar1)
        val seek2 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar2)
        val seek3 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar3)
        val seek4 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar4)
        val seek5 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar5)
        val seek6 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar6)
        val seek7 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar7)
        val seek8 = view.findViewById<SeekBar>(R.id.cmyk_as_seekBar8)

        val seekText1 = view.findViewById<TextView>(R.id.cmykseekbartext1)
        val seekText2 = view.findViewById<TextView>(R.id.cmykseekbartext2)
        val seekText3 = view.findViewById<TextView>(R.id.cmykseekbartext3)
        val seekText4 = view.findViewById<TextView>(R.id.cmykseekbartext4)
        val seekText5 = view.findViewById<TextView>(R.id.cmykseekbartext5)
        val seekText6 = view.findViewById<TextView>(R.id.cmykseekbartext6)
        val seekText7 = view.findViewById<TextView>(R.id.cmykseekbartext7)
        val seekText8 = view.findViewById<TextView>(R.id.cmykseekbartext8)

        val box1 = view.findViewById<View>(R.id.cmykbox1)
        val box2 = view.findViewById<View>(R.id.cmykbox2)

        val hexcode1 = view.findViewById<TextView>(R.id.cmykhexcode1)
        val hexcode2 = view.findViewById<TextView>(R.id.cmykhexcode2)


        //All of the comments added to seekbar 1 apply to other seekbars!!


        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {

                //takes RGB values from slider and converts them to a CMYK format

                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))

                //Changes color inside boxes based on slider movement
                box1.setBackgroundColor(rgb(red, green, blue))

                //Updates hexcode based on slider movement
                update_hexcode(hexcode1, arrayOf(red, green, blue))

                //Makes sure label next to seekbar displays the correct numbers and doesn't go past boundaries
                if(seek1.progress < 50 || seek1.progress == 100) {
                    seekText1.setPadding(((3.84 * seek1.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                }
                else{
                    seekText1.setPadding(((3.84 * seek1.progress.toFloat() + 94)).toInt(), 0, 0, 0)
                }

                seekText1.text = seek1.progress.toString()
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
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))
                box1.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode1, arrayOf(red, green, blue))

                if(seek2.progress < 50 || seek2.progress == 100) {
                    seekText2.setPadding(((3.84 * seek2.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                }
                else{
                    seekText2.setPadding(((3.84 * seek2.progress.toFloat() + 94)).toInt(), 0, 0, 0)
                }

                seekText2.text = seek2.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek3?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {

                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))
                box1.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode1, arrayOf(red, green, blue))

                if(seek3.progress < 50 || seek3.progress == 100) {
                    seekText3.setPadding(((3.84 * seek3.progress.toFloat() + 88)).toInt(), 0, 0, 0)
                }
                else{
                    seekText3.setPadding(((3.84 * seek3.progress.toFloat() + 94)).toInt(), 0, 0, 0)
                }

                seekText3.text = seek3.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek4?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))
                box1.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode1, arrayOf(red, green, blue))

                if(seek4.progress < 50 || seek4.progress == 100) {
                    seekText4.setPadding(((3.84 * seek4.progress.toFloat() + 86)).toInt(), 0, 0, 0)
                }
                else{
                    seekText4.setPadding(((3.84 * seek4.progress.toFloat() + 92)).toInt(), 0, 0, 0)
                }

                seekText4.text = seek4.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek5?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek5, seek6, seek7, seek8))
                box2.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode2, arrayOf(red, green, blue))

                if(seek5.progress < 50 || seek5.progress == 100) {
                    seekText5.setPadding(((3.84 * seek5.progress.toFloat() + 79)).toInt(), 0, 0, 0)
                }
                else{
                    seekText5.setPadding(((3.84 * seek5.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }

                seekText5.text = seek5.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek6?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek5, seek6, seek7, seek8))
                box2.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode2, arrayOf(red, green, blue))

                if(seek6.progress < 50 || seek6.progress == 100) {
                    seekText6.setPadding(((3.84 * seek6.progress.toFloat() + 79)).toInt(), 0, 0, 0)
                }
                else{
                    seekText6.setPadding(((3.84 * seek6.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }

                seekText6.text = seek6.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek7?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek5, seek6, seek7, seek8))
                box2.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode2, arrayOf(red, green, blue))

                if(seek7.progress < 50 || seek7.progress == 100) {
                    seekText7.setPadding(((3.84 * seek7.progress.toFloat() + 79)).toInt(), 0, 0, 0)
                }
                else{
                    seekText7.setPadding(((3.84 * seek7.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }

                seekText7.text = seek7.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        seek8?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek5, seek6, seek7, seek8))
                box2.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode2, arrayOf(red, green, blue))

                if(seek8.progress < 50 || seek8.progress == 100) {
                    seekText8.setPadding(((3.84 * seek8.progress.toFloat() + 79)).toInt(), 0, 0, 0)
                }
                else{
                    seekText8.setPadding(((3.84 * seek8.progress.toFloat() + 85)).toInt(), 0, 0, 0)
                }

                seekText8.text = seek8.progress.toString()
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        return view
    }

    fun convertCMYKValuesToRGB(seekBars: Array<SeekBar>): Triple<Int, Int, Int> {
        //Formulas used to convert the R,G,B values convert correctly to C,M,Y,K
        val black: Float = (1 - (seekBars[3].progress.toFloat() / 100))
        val red: Int = (255 * (1 - (seekBars[0].progress.toFloat() / 100)) * black).toInt()
        val green: Int = (255 * (1 - (seekBars[1].progress.toFloat() / 100)) * black).toInt()
        val blue: Int = (255 * (1 - (seekBars[2].progress.toFloat() / 100)) * black).toInt()

        return Triple(red, green, blue)
    }


    fun update_hexcode(hexcode: TextView, colors: Array<Int>) {
        //Changes CMYK value to correct hexcode

        var hexcodevalue = "#"
        for(i in colors){
            if(i.toString().length == 1){
                hexcodevalue += "0"
                hexcodevalue += (i.toString(16))
            }
            else{
                hexcodevalue += (i.toString(16))
            }
        }
        hexcode.text = hexcodevalue
    }
}
