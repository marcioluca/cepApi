package br.com.desafio.modelo;

public record Cep(String cep,
                  String logradouro,
                  String bairro,
                  String localidade,
                  String uf,
                  String estado) {
}
