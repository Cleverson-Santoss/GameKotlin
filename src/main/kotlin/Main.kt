package org.example

import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


fun main() {

    //Requisição(HttpRequest) para o endpoint da API
    val client: HttpClient = HttpClient.newHttpClient()
    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146")) //Link da Api
        .build()
    //Resposta referente a requisição solicitada (HttpResponse)
    val response = client
        .send(request, BodyHandlers.ofString())

    //Guardando a resposta (response) em uma variável e após imprimindo todas as informações
    val json = response.body()
    println(json)

    //Instanciando a biblioteca Gson
    val gson = Gson()
    //Trazendo os dados do Json da Api para a classe infoJogo, a classe infoJogo é que vai transformar os dados para a classe Jogo
    val meuJogo = gson.fromJson(json, infoJogo::class.java)

    println(meuJogo)
}