package Metodos;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(7,11,2021);

        Data d2 = new Data();
        d2.dia = 31;
        d2.mes = 12;
        d2.ano = 2020;

        System.out.println(d1.DataFormatada());
        System.out.printf(d2.DataFormatada());

    }
}