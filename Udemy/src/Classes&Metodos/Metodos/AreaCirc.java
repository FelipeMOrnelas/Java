package Metodos;

public class AreaCirc {

    double raio;
    static final double pi = 3.1415;

    AreaCirc(double raioInicial){
        raio = raioInicial;
    }
//
    double area(){
        return pi * raio * raio;
    }


}