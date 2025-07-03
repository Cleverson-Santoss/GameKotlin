package org.example

import com.google.gson.annotations.SerializedName

class Jogo(@SerializedName("title") val titulo:String,
           @SerializedName("thumb") val capa:String) {
    // Ao declarar como var, posteriormente o valor pode ser alterado
    // Ao declarar como val, posteriormente o valor nao pode ser alterado, somente no local onde foi declarado
    val descricao = ""

    override fun toString(): String {
        return "Meu jogo:\n" +
                "Titulo: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao\n"
    }
}