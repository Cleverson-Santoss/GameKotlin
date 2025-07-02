package org.example

class Jogo {
    // Ao declarar como var, posteriormente o valor pode ser alterado
    var titulo = ""
    var capa = ""
    // Ao declarar como val, posteriormente o valor nao pode ser alterado, somente no local onde foi declarado
    val descricao = ""

    override fun toString(): String {
        return "Meu jogo:\n" +
                "Titulo: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao\n"
    }
}