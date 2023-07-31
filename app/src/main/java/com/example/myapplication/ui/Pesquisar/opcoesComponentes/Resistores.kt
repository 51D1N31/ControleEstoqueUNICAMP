package com.example.myapplication.ui.Pesquisar.opcoesComponentes

class resistores {
    fun modifyOpcoes(opcoes: MutableList<String>): MutableList<String>{
        var auxiliar = listOf(
            "RESISTOR 0,1Ω",
            "RESISTOR 0,15Ω",
            "RESISTOR 0,22Ω",
            "RESISTOR 0,33Ω",
            "RESISTOR 0,39 Ω",
            "RESISTOR 0,47Ω",
            "RESISTOR 0,51Ω",
            "RESISTOR 0,68Ω",

            //Segunda gaveta
            "RESISTOR 0,82Ω",
            "RESISTOR 1Ω",
            "RESISTOR 1,2Ω",
            "RESISTOR 1,5Ω",
            "RESISTOR 1,8Ω",
            "RESISTOR 2,2Ω",
            "RESISTOR 2,4Ω",
            "RESISTOR 2,7Ω",

            //Terceira gaveta
            "RESISTOR  3,3Ω",
            "RESISTOR 3,9Ω",
            "RESISTOR 4,7Ω",
            "RESISTOR 5,1Ω",
            "RESISTOR 5,6Ω",
            "RESISTOR 6,8Ω",
            "RESISTOR 8,2Ω",
            "RESISTOR 9,1Ω",

        )

        opcoes.addAll(auxiliar)
        return opcoes
    }
}