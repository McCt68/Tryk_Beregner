package com.example.trykberegner

 import android.content.Intent
 import android.net.Uri
 import android.os.Bundle
 import androidx.appcompat.app.AppCompatActivity
 import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnBeregn.setOnClickListener {
            val trykKonstantStart = etStartTryk.text.toString().toDouble() / (etStartTemp.text.toString().toDouble() +273)
            val trykKonstantSlut = etSlutTryk.text.toString().toDouble() / (etSlutTemp.text.toString().toDouble() +273)
            var resultat = trykKonstantSlut * 100 / trykKonstantStart

            var roundedResultat = String.format("%.3f", resultat) // rounds to 3 decimal places
            tvResult.text = roundedResultat.toString()
        }

        // TODO
        // I am second branch
        // New UI with 2 tanks
        // Toast with msg for user when he press Beregn
        // Make save function
        // Make load function that loads last saved data when app is started


//        Homework
//
//        see video 14
//
//        Trykberegner app
//
//                Use viewModels
//
//                Så den ikke ødelægger view når man vender til landscape mode
//
//
//        Husk dependencies in gradle og buildfeatures daabinding in gradle
//
//        Make viewModel class with function to call from main
//
//        in main use databinding
    }
}