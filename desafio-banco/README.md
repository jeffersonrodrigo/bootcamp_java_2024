# Sistema Bancário Simples

Este projeto é um sistema bancário simples, desenvolvido em Java, que permite a criação de contas correntes e contas poupança. O sistema permite operações básicas como **saques**, **depósitos**, **transferências** e **visualização de extratos**. Além disso, várias melhorias foram implementadas para aumentar a robustez e a escalabilidade do sistema.

## Funcionalidades

- **Criação de Conta Corrente**
- **Criação de Conta Poupança**
- **Saque**
- **Depósito**
- **Transferência entre Contas**
- **Impressão de Extrato Bancário**

### Classes e Interfaces Principais

- **IConta.java**: Interface que define as operações básicas de uma conta bancária.
- **Conta.java**: Classe abstrata que implementa a interface `IConta`. Serve como base para diferentes tipos de contas (corrente e poupança).
- **ContaCorrente.java**: Implementação concreta de uma conta corrente, que herda de `Conta`.
- **ContaPoupanca.java**: Implementação concreta de uma conta poupança, que herda de `Conta`.
- **Cliente.java**: Classe que representa o cliente de um banco.
- **Banco.java**: Classe que gerencia as contas bancárias e implementa métodos de busca de contas por cliente.
- **Transacao.java**: Classe responsável por centralizar as operações de saque, depósito e transferência, separando a lógica de transação da conta.
- **Main.java**: Classe que contém o método `main` para testar o sistema.

## Melhorias e Implementações Adicionais

### 1. **Classe `Transacao.java`**
Para aumentar a responsabilidade única de cada classe, foi criada a classe `Transacao`, que é responsável por gerenciar as operações de saque, depósito e transferência. Anteriormente, essas operações estavam dentro da classe `Conta`, o que aumentava o acoplamento. Agora, a `Transacao` permite uma melhor separação de responsabilidades.

Exemplo de uso da classe `Transacao`:

```java
Transacao transacao = new Transacao();
transacao.sacar(contaCorrente, 50.00);
transacao.transferir(contaCorrente, contaPoupanca, 100.00);
```

### 2. **Método de Busca de Contas por Cliente em `Banco.java`**

Foi adicionado um método para buscar contas associadas a um cliente específico no banco. Utilizando `Streams`, é possível filtrar as contas por nome do cliente.

```java
public List<Conta> buscarContasPorCliente(String nomeCliente) {
    return contas.stream()
        .filter(conta -> conta.getCliente().getNome().equalsIgnoreCase(nomeCliente))
        .collect(Collectors.toList());
}
```

### 3. **Validação de Operações Bancárias**

Implementamos validações nas operações de saque e transferência para garantir que o saldo seja suficiente antes de realizar a operação. Isso evita que contas fiquem com saldo negativo inadvertidamente.

Exemplo de validação:

```java
if (valor > conta.getSaldo()) {
    throw new IllegalArgumentException("Saldo insuficiente para a operação.");
}
```

### 4. **Refatoração e Melhorias de Código**

O código foi refatorado para melhorar sua legibilidade e seguir os princípios de SOLID, especialmente no que diz respeito à **Responsabilidade Única** e **Segregação de Interfaces**. Além disso:

- A lógica de impressão de informações comuns de contas foi centralizada em um método separado (`imprimirInfosComuns`), tornando o código mais limpo e reutilizável.
- A classe `Banco` agora gerencia as contas de maneira mais robusta, sendo possível expandir as funcionalidades de gerenciamento facilmente.

## Como Executar o Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/jeffersonrodrigo/bootcamp_java_2024.git
   ```

2. **Compile os arquivos Java:** No terminal, execute o comando:

   ```bash
   javac Main.java
   ```

3. **Execute o programa:**

   ```bash
   java Main
   ```

## Tecnologias Utilizadas

- **Java 17** (ou superior)
- **Visual Studio Code** com extensões de Java
- **Maven** (opcional, para gerenciamento de dependências)

## Contribuições

Sinta-se à vontade para fazer um fork do projeto, abrir issues e enviar pull requests com melhorias, novos recursos ou correções de bugs.

------

### Autor

Jefferson, desenvolvedor em transição para a área de software, focado em backend com Java e PHP. Em constante busca por aprimoramento e oportunidades de trabalho remoto.

------

Este projeto foi desenvolvido como parte de um desafio do bootcamp de Java.
