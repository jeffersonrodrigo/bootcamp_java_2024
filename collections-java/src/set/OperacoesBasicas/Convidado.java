package set.OperacoesBasicas;

public class Convidado {
    //atributos
    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Convidado [nome=" + nome + ", codigoConvite=" + codigoConvite + "]";
    }

    // Método hashCode() para gerar um código hash para o objeto Convidado
    @Override
    public int hashCode() {
        final int prime = 31; // Um número primo utilizado para calcular o hash code
        int result = 1; // Inicializa o resultado do hash code com 1
        result = prime * result + codigoConvite; // Calcula o código hash com base no código de convite
        return result; // Retorna o código hash calculado
    }

    // Método equals() para comparar dois objetos Convidado
    @Override
    public boolean equals(Object obj) {
        // Verifica se o objeto atual é o mesmo que o objeto passado como argumento
        if (this == obj)
            return true;
        // Verifica se o objeto passado como argumento é null
        if (obj == null)
            return false;
        // Verifica se os objetos pertencem a classes diferentes
        if (getClass() != obj.getClass())
            return false;
        // Faz o cast do objeto para a classe Convidado
        Convidado other = (Convidado) obj;
        // Compara os códigos de convite dos dois objetos
        if (codigoConvite != other.codigoConvite)
            return false;
        // Retorna verdadeiro se os códigos de convite forem iguais
        return true;
    }
    
}
