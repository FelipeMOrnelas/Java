package EqualsHashcode;

public class EqualsHashcode {
    public static void main(String[] args) {

        usuario u1 = new usuario();
        u1.nome = "Pedro Silva";
        u1.email = "pedro.silva@ezemail.com.br";

        usuario u2 = new usuario();
        u2.nome = "Pedro Silva";
        u2.email = "pedro.silva@ezemail.com.br";

        usuario u3 = new usuario();
        u3.nome = "Pedro Silvas";
        u3.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1.equals(u3));


    }
}