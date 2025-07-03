package org.example

//Criando uma classe Info que é a chave onde estão os atributos desejados na API
//Informando que a classe info é do tipo jogo
class infoJogo(val info: Jogo) {

    //Criando um toString e utilizando o mesmo ja criado no Jogo
    override fun toString(): String {
        return info.toString()
    }
}