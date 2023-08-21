package viacep;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {
    public Endereco buscaEndereco(String cep) throws IOException, InterruptedException {

        String endereco = "https://viacep.com.br/ws/"+ cep +"/json/";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Endereco.class);
        } catch (IOException | InterruptedException exception) {
            throw new RuntimeException ("Não consegui obter o endereço a partir desse CEP.");
        }

    };
}

