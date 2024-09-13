import br.com.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso de java basico");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso de javaScript");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);
    }
}
