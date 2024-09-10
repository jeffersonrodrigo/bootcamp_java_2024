import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    private List<Transacao> transacoes = new ArrayList<>();

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= valor;
        // Registrar transação de saque
        transacoes.add(new Transacao("Saque", valor, LocalDate.now().toString()));
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        // Registrar transação de depósito
        transacoes.add(new Transacao("Depósito", valor, LocalDate.now().toString()));
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para transferência.");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        // Registrar transação de transferência
        transacoes.add(new Transacao("Transferência", valor, LocalDate.now().toString()));
    }

    // Método para imprimir transações
    public void imprimirTransacoes() {
        System.out.println("=== Histórico de Transações ===");
        for (Transacao transacao : transacoes) {
            System.out.println(transacao.getResumoTransacao());
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
