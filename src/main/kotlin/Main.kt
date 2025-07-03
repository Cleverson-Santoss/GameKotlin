package org.example

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

    //Forma de instanciar um objeto de acordo com o construtor criado na classe
    val meuJogo = Jogo("Batman: Arkham Asylum Game of the Year Edition", "https:\\\\/\\\\/cdn.cloudflare.steamstatic.com\\\\/steam\\\\/apps\\\\/35140\\\\/capsule_sm_120.jpg?t=1681938587")

    println(meuJogo)
}