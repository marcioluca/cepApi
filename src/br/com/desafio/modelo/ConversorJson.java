package br.com.desafio.modelo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

public class ConversorJson {

    public void Converte(Cep cep) throws IOException {
        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        FileWriter escrita = new FileWriter( cep.cep() + ".json");
        escrita.write(gson.toJson(cep));
        escrita.close();

    }

}
