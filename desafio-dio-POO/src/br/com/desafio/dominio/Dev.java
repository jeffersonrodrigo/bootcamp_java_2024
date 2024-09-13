package br.com.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
    // Atributos = Nome, conteudosInscritos, conteudosConcluidos
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // LinkedHashSet pois queremos que seja salvo na mesma ordem
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); 


    // Métodos = inscrever, progredir, calcularTotalXp
    public void inscreverBootcamp(Bootcamp bootcamp){ // Ao ser chamado e passar o bootcamp, o dev sera inscrito no bootcamp
        this.conteudosInscritos.addAll(bootcamp.getConteudos());//O método inscreve o desenvolvedor no Bootcamp, adicionando todos os conteúdos do 
                                                                //Bootcamp à lista de conteúdos inscritos do dev, utilizando o método addAll().
        bootcamp.getDevsIncritos().add(this); // adiciona o próprio dev à lista de desenvolvedores inscritos no Bootcamp
    }

    public void progredir(){ // A medida que for fazendo
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst(); //O método permite que o dev progrida nos conteúdos inscritos, utilizando 
                                                                                    //stream().findFirst() para localizar o primeiro conteúdo a ser completado.
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteudo");
        }
    } 

    public double calcularTotalXp(){ //Calcular o total de experiencia ganha
        return this.conteudosConcluidos
        .stream()
        .mapToDouble(conteudo -> conteudo.calcularXp())
        .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    //Criação do hashcode e equals pois estamos trabalhando com LinkedHashSet
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((conteudosInscritos == null) ? 0 : conteudosInscritos.hashCode());
        result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dev other = (Dev) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (conteudosInscritos == null) {
            if (other.conteudosInscritos != null)
                return false;
        } else if (!conteudosInscritos.equals(other.conteudosInscritos))
            return false;
        if (conteudosConcluidos == null) {
            if (other.conteudosConcluidos != null)
                return false;
        } else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
            return false;
        return true;
    }

    
}
