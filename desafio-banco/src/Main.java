public class Main {

    public static void main(String[] args) {
        Cliente jeff = new Cliente();
        jeff.setNome("Jefferson");

        ContaCorrente cc = new ContaCorrente(jeff);
        ContaPoupanca poupanca = new ContaPoupanca(jeff);

        cc.depositar(75.89);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc.transferir(10, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Exibir histórico de transações
        cc.imprimirTransacoes();
    }
}
