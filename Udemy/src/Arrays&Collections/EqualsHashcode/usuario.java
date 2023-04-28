package EqualsHashcode;

import java.util.Objects;

public class usuario {

    String nome, email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        usuario usuario = (usuario) o;
        return Objects.equals(nome, usuario.nome) && Objects.equals(email, usuario.email);
    }
//
    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}