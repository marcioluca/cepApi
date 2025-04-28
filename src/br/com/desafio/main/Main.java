package br.com.desafio.main;
import br.com.desafio.modelo.Buscador;
import br.com.desafio.modelo.Cep;
import br.com.desafio.modelo.ConversorJson;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cep;
        String resposta;
        Buscador busca = new Buscador();
        Scanner s = new Scanner(System.in);

        System.out.println("========================");
        System.out.println("BEM VINDO AO BUSCACEP");
        do {
            try {
                System.out.print("Informe o cep que deseja consultar: ");
                cep = s.nextLine();
                Cep consulta = busca.buscaEndereco(cep);
                ConversorJson conversorJson = new ConversorJson();
                conversorJson.Converte(consulta);
                System.out.println(consulta);
            } catch (RuntimeException | IOException e){
                System.out.println(e.getMessage());
            }
            System.out.println("Deseja Fazer outra busca?");
            resposta = s.nextLine();
        } while (!resposta.equalsIgnoreCase("nao"));


        System.out.println("Finalizando sistema...");
    }
}