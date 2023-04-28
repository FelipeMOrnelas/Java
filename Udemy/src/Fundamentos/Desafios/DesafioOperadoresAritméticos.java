package Fundamentos.Desafios;

public class DesafioOperadoresAritméticos {
    public static void main(String[] args) {

        int expressoes1 = (6*(3+2));
        int expressoes2 = ((1-5)*(2-7))/2;
        int divizao = (int) Math.pow(10, 3);
        int subtracao, resultado;

        expressoes1 = (int) Math.pow(expressoes1,2);
        expressoes1 = expressoes1 / (3*2);

        expressoes2 = (int) Math.pow(expressoes2,2);

        subtracao = expressoes1 - expressoes2;
        subtracao = (int) Math.pow(subtracao, 3);

        resultado = subtracao/divizao;
        System.out.println("Resultado = "+resultado);
    }
}
