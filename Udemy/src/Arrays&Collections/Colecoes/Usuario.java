package Colecoes;

import java.util.Objects;
//
public class Usuario {

    String nome;

    public String toString(){
        return "meu nome e "+ this.nome + ".";
    }

    Usuario(String nome){
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
