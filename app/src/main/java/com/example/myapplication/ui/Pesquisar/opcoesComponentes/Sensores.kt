package com.example.myapplication.ui.Pesquisar.opcoesComponentes

class Sensores {
    fun modifyOpcoes(opcoes: MutableList<String>): MutableList<String>{
        var auxiliar = listOf(
            "sensor capacitivos",
            "sensor indutivos",
            "sensor ultrassônicos",
            "sensor magnéticos",
            "sensor fotoelétricos",
            "sensor laser"
        )

        opcoes.addAll(auxiliar)
        return opcoes
    }
}