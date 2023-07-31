package com.example.myapplication.ui.Pesquisar

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import com.example.myapplication.R
import com.example.myapplication.ui.Pesquisar.opcoesComponentes.Atuadores
import com.example.myapplication.ui.Pesquisar.opcoesComponentes.Sensores
import com.example.myapplication.ui.Pesquisar.opcoesComponentes.resistores
import com.google.android.material.textfield.TextInputLayout

class Pesquisar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisar)

        var opcoes = mutableListOf("")


        //------------TESTE------------
        //val texto = findViewById<TextView>(R.id.testeTXT)
        //val apiResponse = URL("https://lit-mountain-74037-1e8edf0f338d.herokuapp.com/").readText()
        //------------TESTE------------

        //Dropdown Tipos Componenetes
        val items = listOf("Resistores",
            "LEDs",
            "Botões e Chaves",
            "Sensores",
            "Atuadores",
            "Motores",
            "Buzzers",
            "Displays",
            "Teclados Matriciais",
            "Módulos de Comunicação"
        )

        val autocomplete : AutoCompleteTextView = findViewById(R.id.auto_complete)
        val adapter = ArrayAdapter(this,R.layout.list_item,items)

        autocomplete.setAdapter(adapter)
        autocomplete.onItemClickListener = AdapterView.OnItemClickListener { adapterView, view, i, l ->

            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "item: $itemSelected", Toast.LENGTH_SHORT).show()

            val itemSpecificClick = findViewById<View>(R.id.dropdown_specific)
            // Esta dando sobreposição, resolver futuramente
            //val hintSpecificClick = findViewById<TextView>(R.id.list_specific)
            //(findViewById<AutoCompleteTextView>(R.id.list_specific)).setSelection(0)
            when(itemSelected) {
                "Resistores" -> {
                    itemSpecificClick.isVisible = true

                    val resistoresInstanciado = resistores()
                    opcoes.clear()
                    opcoes = resistoresInstanciado.modifyOpcoes(opcoes)
                    //hintSpecificClick.setHint("Resistência Elétrica 2.0")
                }

                "LEDs" -> {
                    itemSpecificClick.isVisible = false
                }

                "Botões e Chaves" -> {
                    itemSpecificClick.isVisible = false
                    //hintSpecificClick.setHint("Resistência Sensor")
                }

                "Sensores" -> {
                    itemSpecificClick.isVisible = true

                    val sensoresInstanciado = Sensores()
                    opcoes.clear()
                    opcoes = sensoresInstanciado.modifyOpcoes(opcoes)

                }

                "Atuadores" -> {
                    itemSpecificClick.isVisible = true

                    val atuadoresInstanciado = Atuadores()
                    opcoes.clear()
                    opcoes = atuadoresInstanciado.modifyOpcoes(opcoes)

                }

                "Motores" -> {
                    itemSpecificClick.isVisible = false


                }

                "Buzzers" -> {
                    itemSpecificClick.isVisible = false

                }

                "Displays" -> {
                    itemSpecificClick.isVisible = false

                }

                "Teclados Matriciais" -> {
                    itemSpecificClick.isVisible = false

                }

                "Módulos de Comunicação" -> {
                    itemSpecificClick.isVisible = false

                }
            }

            val listSpecific : AutoCompleteTextView = findViewById(R.id.list_specific)
            val adapterSpecific = ArrayAdapter(this,R.layout.list_specific,opcoes)

            listSpecific.setAdapter(adapterSpecific)
            listSpecific.setText("")
        }

        //Dropdown Especificação do Componente
        //val opcoes = listOf("RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω", "RESISTOR 0,1Ω", "RESISTOR 0,15Ω",

        val listSpecific : AutoCompleteTextView = findViewById(R.id.list_specific)

        listSpecific.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, i, l ->

            val specificSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(this, "item: $specificSelected", Toast.LENGTH_SHORT).show()

            //Deixar A Gaveta e Posicao visiveis
            (findViewById<TextView>(R.id.gaveta)).isVisible = true
            (findViewById<TextView>(R.id.posicao)).isVisible = true
            (findViewById<TextView>(R.id.posicionGaveta)).isVisible = true
            (findViewById<TextView>(R.id.posicionPosicao)).isVisible = true

        }
    }
}