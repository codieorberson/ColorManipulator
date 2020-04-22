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

        val hexcode1 = view.findViewById<TextView>(R.id.cmykhexcode1)
        val hexcode2 = view.findViewById<TextView>(R.id.cmykhexcode2)

        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {

                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))
                box1.setBackgroundColor(rgb(red, green, blue))
                update_hexcode(hexcode1, arrayOf(red, green, blue))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
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
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
            }

            override fun onStopTrackingTouch(seek: SeekBar) {
            }
        })

        return view
    }

    fun convertCMYKValuesToRGB(seekBars: Array<SeekBar>): Triple<Int, Int, Int> {

        val black: Float = (1 - (seekBars[3].progress.toFloat() / 100))
        val red: Int = (255 * (1 - (seekBars[0].progress.toFloat() / 100)) * black).toInt()
        val green: Int = (255 * (1 - (seekBars[1].progress.toFloat() / 100)) * black).toInt()
        val blue: Int = (255 * (1 - (seekBars[2].progress.toFloat() / 100)) * black).toInt()

        return Triple(red, green, blue)
    }

    fun update_hexcode(hexcode: TextView, colors: Array<Int>) {
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
