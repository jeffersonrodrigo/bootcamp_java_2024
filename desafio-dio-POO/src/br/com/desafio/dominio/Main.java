package br.com.desafio.dominio;

import java.time.LocalDate;

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

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descrição da mentoria");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJefferson = new Dev();
        devJefferson.setNome("Jefferson");
        devJefferson.inscreverBootcamp(bootcamp);
        System.out.println(devJefferson.getNome() + " ->Conteudos inscritos " + devJefferson.getConteudosInscritos());
        devJefferson.progredir();
        devJefferson.progredir();
        System.out.println("-");
        System.out.println(devJefferson.getNome() + " ->Conteudos inscritos " + devJefferson.getConteudosInscritos());
        System.out.println(devJefferson.getNome() + " ->Conteudos Concluidos " + devJefferson.getConteudosConcluidos());
        System.out.println("XP: " + devJefferson.calcularTotalXp());
        
        System.out.println("--------------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println(devMaria.getNome() + " ->Conteudos inscritos " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("-");
        System.out.println(devMaria.getNome() + " ->Conteudos inscritos " + devMaria.getConteudosInscritos());
        System.out.println(devMaria.getNome() + " ->Conteudos Concluidos " + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}
