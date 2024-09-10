import java.util.List;
import java.util.stream.Collectors;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numero) {
        return contas.stream()
                .filter(conta -> conta.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public List<Conta> buscarContasPorCliente(String nomeCliente) {
        return contas.stream()
                .filter(conta -> conta.getCliente().getNome().equalsIgnoreCase(nomeCliente))
                .collect(Collectors.toList());
    }

}
