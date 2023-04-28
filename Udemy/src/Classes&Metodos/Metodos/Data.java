package Metodos;

public class Data {
    int dia, mes, ano;

    Data(){
        this(1,2,2020);
    }

    Data(int dia, int mesInicial, int anoInicial){
        this.dia = dia;
        mes = mesInicial;
        ano = anoInicial;
    }

    String DataFormatada(){
        return String.format("%d/%d/%d", dia, mes, ano);
    }
}
