package com.example.trykberegner

import androidx.lifecycle.ViewModel
import com.example.trykberegner.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

// This way I can still use landscape mode without destroying the variables when the phone is turned

class MainActivityModel : ViewModel() {

    // WORK ON THIS LATER WHEN I UNDERSTAND IT BETTER !
    // I MIGHT HAVE TO USE BINDING IN THIS CLASS ALSO TO GET INFO FROM VIEWS ?

    // vars needed for calculation. Maybe I don't have to specify them here ??
    private var trykKonstantStart = 0.0
    private var trykKonstantSlut = 0.0
    private var resultat = 0.0
    private var roundedResultat = 0.0


    // give 4 needed parameters to make calculation
    fun beregnTrykSetters(startTryk: Double, startTemp: Double, slutTryk: Double, slutTemp: Double): Double{

        //Do tryk beregning here, and call this function from MainActivity
        trykKonstantStart = startTryk / (startTemp + 273)
        trykKonstantSlut = slutTryk / (slutTemp +273)
        resultat = trykKonstantSlut * 100 / trykKonstantStart

        roundedResultat = String.format("%.2f", resultat).toDouble() // rounds to 3 decimal places
        // tvResult.text = roundedResultat.toString()
        return roundedResultat
    }

    fun getResult(): Double{
        return roundedResultat
    }
}