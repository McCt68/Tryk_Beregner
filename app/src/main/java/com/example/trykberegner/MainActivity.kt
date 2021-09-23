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
        // New UI with 2 tanks
        // Toast with msg for user when he press Beregn
        // Make save function
        // Make load function that loads last saved data when app is started

        // I am second branch

        fun testBranch(){
            //test
        }

        /** Not using this for now
btnLink.setOnClickListener {
    // make a link to explanation
    val data = Uri.parse("https://nbi.ku.dk/spoerg_om_fysik/fysik/gaslove/")
    val defaultBrowser =
        Intent.makeMainSelectorActivity(Intent.ACTION_MAIN, Intent.CATEGORY_APP_BROWSER)
    defaultBrowser.setData(data)
    startActivity(defaultBrowser)

}
        **/

    }
}