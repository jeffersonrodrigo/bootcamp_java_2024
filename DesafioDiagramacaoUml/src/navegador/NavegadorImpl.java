package navegador;

public class NavegadorImpl implements Navegador{
    public void exibirPagina(String url) {
        System.out.println("Exibindo uma página");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
}
