package com.example.myapplication.ui.Pesquisar.opcoesComponentes

class Atuadores {
    fun modifyOpcoes(opcoes: MutableList<String>): MutableList<String>{
        var auxiliar = listOf(
            "motor de passo",
            "servo-motor"
        )

        opcoes.addAll(auxiliar)
        return opcoes
    }
}