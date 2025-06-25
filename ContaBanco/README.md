
# 💻 Desafio: ContaBanco (DIO - Trilha Java Básico)

Este projeto foi desenvolvido como parte do curso **"Sintaxe Java"** da plataforma [DIO.me](https://www.dio.me/), em parceria com o Santander. O objetivo foi exercitar os fundamentos da linguagem Java, utilizando entrada de dados via terminal e operações básicas com variáveis.

---

## 📋 Descrição do Desafio

Crie uma aplicação simples em Java que simule a criação de uma conta bancária a partir da entrada de dados do usuário via terminal.

### 🧾 Requisitos

- Solicitar os seguintes dados:
  - Número da conta (inteiro)
  - Número da agência (texto, ex: `067-8`)
  - Nome do cliente
  - Saldo (decimal)
  
- Exibir uma mensagem formatada com os dados informados:

```
Olá [Nome Cliente], obrigado por criar uma conta em nosso banco,
sua agência é [Agência], conta [Número] e seu saldo [Saldo] já está disponível para saque.
```

---

## 🛠️ Tecnologias utilizadas

- Java 17+
- IntelliJ IDEA 
- Terminal 
- `Scanner` para entrada de dados

---

## 📂 Estrutura do Projeto

```
ContaBanco/
├── src/
│   └── ContaTerminal.java
└── README.md
```

---

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/bswbruno/ContaBanco.git
   ```

2. Acesse a pasta do projeto e compile:
   ```bash
   cd ContaBanco/src
   javac ContaTerminal.java
   ```

3. Execute o programa:
   ```bash
   java ContaTerminal
   ```

---

## 🧪 Exemplo de execução

```
Por favor, digite o número da conta: 1021
Por favor, digite o número da agência: 067-8
Digite o nome do cliente: MARIO ANDRADE
Por favor, digite o saldo bancário: 237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco,
sua agência é 067-8, conta 1021 e seu saldo R$237.48 já está disponível para saque.
```

---

## 👨‍🏫 Autor e Referência

Desenvolvido por **Bruno** como parte da trilha **Java Básico** da [DIO](https://www.dio.me/), com orientação do professor **José Luiz Abreu Cardoso Junior**.
