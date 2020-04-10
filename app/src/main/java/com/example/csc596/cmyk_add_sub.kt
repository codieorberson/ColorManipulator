package com.example.csc596

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import kotlinx.android.synthetic.main.fragment_cmyk_add_sub.*

class cmyk_add_sub : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_cmyk_add_sub, container, false)

        val seek1 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar1)
        val seek2 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar2)
        val seek3 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar3)
        val seek4 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar4)
        val seek5 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar5)
        val seek6 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar6)
        val seek7 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar7)
        val seek8 = view.findViewById<SeekBar>(R.id.cmyk_addorsub_as_seekBar8)

        val box1 = view.findViewById<View>(R.id.cmyk_addorsub_box1)
        val box2 = view.findViewById<View>(R.id.cmyk_addorsub_box2)

        seek1?.setOnSeekBarChangeListener(object :
            SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(
                seek: SeekBar,
                progress: Int, fromUser: Boolean
            ) {
                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))

                updateSeekBarValues(arrayOf(seek5, seek6, seek7, seek8, seek1, seek2, seek3, seek4))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek5,
                        seek6,
                        seek7,
                        seek8
                    )
                )

                box1.setBackgroundColor(Color.rgb(red, green, blue))
                box2.setBackgroundColor(Color.rgb(red2, green2, blue2))

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

                updateSeekBarValues(arrayOf(seek5, seek6, seek7, seek8, seek1, seek2, seek3, seek4))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek5,
                        seek6,
                        seek7,
                        seek8
                    )
                )

                box1.setBackgroundColor(Color.rgb(red, green, blue))
                box2.setBackgroundColor(Color.rgb(red2, green2, blue2))
            }

            override fun onStartTrackingTouch(seek: SeekBar) {
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

                val (red, green, blue) = convertCMYKValuesToRGB(arrayOf(seek1, seek2, seek3, seek4))

                updateSeekBarValues(arrayOf(seek5, seek6, seek7, seek8, seek1, seek2, seek3, seek4))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek5,
                        seek6,
                        seek7,
                        seek8
                    )
                )

                box1.setBackgroundColor(Color.rgb(red, green, blue))
                box2.setBackgroundColor(Color.rgb(red2, green2, blue2))
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

                updateSeekBarValues(arrayOf(seek5, seek6, seek7, seek8, seek1, seek2, seek3, seek4))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek5,
                        seek6,
                        seek7,
                        seek8
                    )
                )

                box1.setBackgroundColor(Color.rgb(red, green, blue))
                box2.setBackgroundColor(Color.rgb(red2, green2, blue2))
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

                updateSeekBarValues(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6, seek7, seek8))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek1,
                        seek2,
                        seek3,
                        seek4
                    )
                )

                box2.setBackgroundColor(Color.rgb(red, green, blue))
                box1.setBackgroundColor(Color.rgb(red2, green2, blue2))
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

                updateSeekBarValues(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6, seek7, seek8))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek1,
                        seek2,
                        seek3,
                        seek4
                    )
                )

                box2.setBackgroundColor(Color.rgb(red, green, blue))
                box1.setBackgroundColor(Color.rgb(red2, green2, blue2))
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

                updateSeekBarValues(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6, seek7, seek8))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek1,
                        seek2,
                        seek3,
                        seek4
                    )
                )

                box2.setBackgroundColor(Color.rgb(red, green, blue))
                box1.setBackgroundColor(Color.rgb(red2, green2, blue2))
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

                updateSeekBarValues(arrayOf(seek1, seek2, seek3, seek4, seek5, seek6, seek7, seek8))

                val (red2, green2, blue2) = convertCMYKValuesToRGB(
                    arrayOf(
                        seek1,
                        seek2,
                        seek3,
                        seek4
                    )
                )

                box2.setBackgroundColor(Color.rgb(red, green, blue))
                box1.setBackgroundColor(Color.rgb(red2, green2, blue2))
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

    fun updateSeekBarValues(seekbars: Array<SeekBar>) {
        seekbars[0].progress = 100 - seekbars[4].progress
        seekbars[1].progress = 100 - seekbars[5].progress
        seekbars[2].progress = 100 - seekbars[6].progress
        seekbars[3].progress = 100 - seekbars[7].progress
    }


}
