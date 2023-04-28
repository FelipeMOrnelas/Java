package Fundamentos;

import javax.swing.*;

public class Fundamentos {
    public static void main(String[] args) {

        String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("Digite o segundo numero: ");

        Double numero1 = Double.parseDouble(valor1);
        Double numero2 = Double.parseDouble(valor2);
        Double soma = numero1+numero2;

        System.out.println("Soma dos numeros: "+soma);
        System.out.println("Media dos numeros: "+soma/2);

    }
}
