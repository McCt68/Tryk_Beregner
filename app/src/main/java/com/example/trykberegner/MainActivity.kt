package com.example.trykberegner

 import android.content.Intent
 import android.net.Uri
 import android.os.Bundle
 import androidx.appcompat.app.AppCompatActivity
 import androidx.databinding.DataBindingUtil
 import androidx.lifecycle.ViewModelProvider
 import com.example.trykberegner.databinding.ActivityMainBinding
 import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    //
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityModel::class.java)

        // maybe this is needed to not destroy when i turn phone ??
        // Seems it is, but not sure I understand why ?
        binding.tvResult.text = viewModel.getResult().toString()

        // using viewModel. calling the function from class MainActivityModel
        // I could use apply here so i don't have to specify binding. everytime ??
        binding.btnBeregn.setOnClickListener {
            viewModel.beregnTrykSetters(
                binding.etStartTryk.text.toString().toDouble(),
                binding.etStartTemp.text.toString().toDouble(),
                binding.etSlutTryk.text.toString().toDouble(),
                binding.etSlutTemp.text.toString().toDouble()
                )
            binding.tvResult.text = viewModel.getResult().toString()
            // Make toast here
        }


        // TODO
        // I am second branch
        // New UI with 2 tanks
        // Toast with msg for user when he press beregn
        // Make save function
        // Make load function that loads last saved data when app is started


//        Homework
//        see video 14 - Trykberegner app
//        Use viewModels Så den ikke ødelægger view når man vender til landscape mode
//        Husk dependencies in gradle og buildfeatures databinding in gradle
//        Make viewModel class with function to call from main, in main use databinding.


        // CAN DELETE THIS
        // Old way before viewBinding, and not using viewModels
//        btnBeregn.setOnClickListener {
//            val trykKonstantStart = etStartTryk.text.toString().toDouble() / (etStartTemp.text.toString().toDouble() +273)
//            val trykKonstantSlut = etSlutTryk.text.toString().toDouble() / (etSlutTemp.text.toString().toDouble() +273)
//            var resultat = trykKonstantSlut * 100 / trykKonstantStart
//
//            var roundedResultat = String.format("%.3f", resultat) // rounds to 3 decimal places
//            tvResult.text = roundedResultat.toString()
//        }

    }
}