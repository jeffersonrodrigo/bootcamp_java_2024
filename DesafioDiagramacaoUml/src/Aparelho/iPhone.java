package Aparelho;
import navegador.Navegador;
import reprodutor.Reprodutor;
import telefone.Telefone;

public class iPhone implements Navegador, Reprodutor, Telefone{
    public void tocar() {
        System.out.println("Tocando musica do iPhone");
    }

    public void pausar() {
        System.out.println("Pausando musica do iPhone");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica do iPhone");
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo uma pagina do iPhone");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando uma pagina do iPhone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando pagina do iPhone");
    }
    public void ligar(String numero) {
        System.out.println("Ligando para alguem do iPhone");
    }

    public void atender() {
        System.out.println("Atendendo uma chamada do iPhone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz do iPhone");
    }

}
