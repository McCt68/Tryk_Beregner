package com.example.trykberegner

 import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
 import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnBeregn.setOnClickListener {
            val trykKonstantStart = etStartTryk.text.toString().toDouble() / (etStartTemp.text.toString().toDouble() +273)
            val trykKonstantSlut = etSlutTryk.text.toString().toDouble() / (etSlutTemp.text.toString().toDouble() +273)
            var resultat = trykKonstantSlut * 100 / trykKonstantStart

            tvResult.text = resultat.toString()
        }



        /*Dette virker
        btnBeregn.setOnClickListener{
            var test_1 = etStartTemp.text.toString().toDouble()
            var test_2 = etStartTryk.text.toString().toDouble()
            var result = test_1 + test_2
            tvResult.text = result.toString()
        }
    */
    }
}