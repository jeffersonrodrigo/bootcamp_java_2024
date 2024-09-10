public class Transacao {
    private String tipo; // Saque, Depósito, Transferência
    private double valor;
    private String data;

    public Transacao(String tipo, double valor, String data) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }

    public String getResumoTransacao() {
        return String.format("%s de %.2f em %s", tipo, valor, data);
    }
}
