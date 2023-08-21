package viacep;

public record Endereco(String cep, String logradouro, String complemento,
                       String bairro, String localidade, String uf ) {

}

// "cep": "01001-000",
// "logradouro": "Praça da Sé",
// "complemento": "lado ímpar",
// "bairro": "Sé",
// "localidade": "São Paulo",
// "uf": "SP",
