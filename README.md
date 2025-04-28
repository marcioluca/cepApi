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
