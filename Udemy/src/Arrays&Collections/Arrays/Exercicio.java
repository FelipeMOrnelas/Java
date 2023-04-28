package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double notas[] = new double[3];

        notas[0] = 10;
        notas[1] = 5.5;
        notas[2] = 7.8;

        System.out.println(notas[0]);
        System.out.println(Arrays.toString(notas));

        double total = 0;

        for(int i = 0; i < notas.length; i++){
            total += notas[i];
        }

        System.out.println(total);

        System.out.printf("Media = "+ total/notas.length);


    }


}