package br.com.desafio.modelo;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Buscador {
    public Cep buscaEndereco(String cep) {
        URI endereco = URI.create ("https://viacep.com.br/ws/" + cep + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Cep.class);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel obter o endereço com CEP informado.");
        }

        }

}
