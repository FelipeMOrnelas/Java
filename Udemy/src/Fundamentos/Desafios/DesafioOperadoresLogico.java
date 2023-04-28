package Fundamentos.Desafios;

public class DesafioOperadoresLogico {
    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou Tv50\"?" + comprouTv50);
        System.out.println("Comprou Tv32\"?" + comprouTv32);
        System.out.println("Comprou Sorvete?" + comprouSorvete);
        System.out.println("Mais saudavel?" + !comprouSorvete);

    }
}
