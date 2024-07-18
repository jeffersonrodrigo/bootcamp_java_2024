package telefone;

public class TelefoneImpl implements Telefone{
    public void ligar(String numero) {
        System.out.println("Ligando para alguem");
    }

    public void atender() {
        System.out.println("Atendendo uma chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Ouvindo correio de voz");
    }
}
