package viacep;

import java.io.IOException;
import java.util.Scanner;

public class ViaCep {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe o cep: ");
        String cep = scanner.nextLine();

        try {
            ConsultaCep consultaCep = new ConsultaCep();
            Endereco endereco = consultaCep.buscaEndereco(cep);
            System.out.println(endereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
