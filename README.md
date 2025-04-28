Perfeito, Márcio! Entendi seu objetivo: **tratamento de exceções**, **consumo de API** e **gravação de arquivos JSON**.

Vou criar um **README.md** bem feito, didático e direto ao ponto para o seu projeto, como se fosse para colocar no seu GitHub:

---

# 📦 cepApi

Este projeto é uma aplicação Java simples criada com o objetivo de praticar:

- Tratamento de exceções
- Consumo de uma API pública (ViaCEP)
- Gravação de respostas em arquivos no formato JSON

---

## 🚀 Tecnologias utilizadas

- Java 21
- Maven
- API pública [ViaCEP](https://viacep.com.br/)
- `HttpURLConnection` (biblioteca padrão do Java)
- Manipulação de arquivos (`FileWriter`)

---

## ⚙️ Como executar o projeto

**Pré-requisitos**:
- Ter o [Java 17](https://jdk.java.net/17/) instalado.
- Ter o [Maven](https://maven.apache.org/) instalado.

**Passos para rodar**:

1. Clone o repositório:
   ```bash
   git clone https://github.com/marcioluca/cepApi.git
   cd cepApi
   ```

2. Compile o projeto:
   ```bash
   mvn compile
   ```

3. Execute o projeto:
   ```bash
   mvn exec:java -Dexec.mainClass="br.com.cepApi.Main"
   ```

---

## 📜 Sobre o funcionamento

- O programa faz uma requisição para a API ViaCEP, buscando dados de endereço a partir de um CEP.
- Trata exceções caso ocorram erros de conexão ou de resposta.
- Salva a resposta obtida da API em um arquivo `.json` local.

---

## 👨‍💻 Autor

Feito por [Márcio Luca](https://github.com/marcioluca) 🚀
