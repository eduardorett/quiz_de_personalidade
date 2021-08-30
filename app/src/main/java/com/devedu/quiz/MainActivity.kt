package com.devedu.quiz

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var positivo = 0
        var negativo = 0


        btnCheckSadOne.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
             negativo ++

            }else{
                negativo --
            }
        }

        btnCheckSadtwo.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                negativo ++

            }else{
                negativo--
            }
        }
        btnCheckSadThree.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                negativo ++

            }else{
                negativo--
            }
        }

        btnCheckSadFour.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                negativo ++

            }else{
                negativo--
            }
        }

        btnCheckSadFive.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                negativo ++

            }else{
                negativo--
            }
        }

        btnCheckHappyOne.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                positivo ++

            }else{
                positivo--
            }
        }

        btnCheckHappyTwo.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                positivo ++

            }else{
                positivo--
            }
        }

        btnCheckHappyTrhee.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                positivo ++

            }else{
                positivo--
            }
        }

        btnCheckHappyFour.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                positivo ++

            }else{
                positivo--
            }
        }

        btnCheckHappyFive.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                positivo ++

            }else{
                positivo--
            }
        }

        btnResultado.setOnClickListener {
            val feliznormal = positivo
            val tristenormal = negativo
            val max = negativo + positivo
            val min = negativo - positivo
            var positivo = "Voce é uma pessoa animada"
            var negativo = "voce é uma pessoa negativa"
            val equilibrado = "voce é uma pessoa equilbrada"


            when(max){
                2,4,6,8,10 ->  textView.text = equilibrado

            }
            if (feliznormal > tristenormal ) {
                textView.text = positivo
            }
            if (tristenormal > feliznormal) {
                textView.text = negativo
            }
         if(max == 0 ){
                 Toast.makeText(this,"Porfavor preencha pelo menos uma caixa", Toast.LENGTH_SHORT).show()
            }



            btnReset.setOnClickListener{

                btnCheckHappyOne.isChecked = false
                btnCheckHappyTwo.isChecked = false
                btnCheckHappyTrhee.isChecked = false
                btnCheckHappyFour.isChecked = false
                btnCheckHappyFive.isChecked = false
                btnCheckSadOne.isChecked = false
                btnCheckSadtwo.isChecked = false
                btnCheckSadThree.isChecked = false
                btnCheckSadFour.isChecked = false
                btnCheckSadFive.isChecked = false

                textView.text = "Esperando respostas..."
            }

        }


    }


    }


