import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Digite algo");
         * String vlr = sc.nextLine();
         * System.out.println(vlr);
         * int teste = 10;
         * float testeFloat = 23;
         * double testeDouble = 23.8;
         * String nomes[] = new String[10];
         * if (teste > 19) {
         * System.out.println(vlr);
         * }
         * String resultado = "";
         * for (int i = 0; i < teste; i++) {
         * System.out.println(i);
         * }
         * for(String aux : nomes){
         * resultado[] += auz + "\n"; }
         */
        float num[] = new float[10];

        Scanner sc = new Scanner(System.in);
        float maior = num[0];
        float menor = num[0];
        float soma = num[0];
        float valoresArray = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero" + (i + 1));
            num[i] = sc.nextFloat();
        }

        for (int i = 1; i < 10; i++) {

            valoresArray = num[i];
            if (num[i] > maior) {
                maior = num[i];
            }
            if (num[i] < menor) {
                menor = num[i];
            }
            soma += num[i];
        }
        float media = soma / 10;
        System.out.println("O maior numero é" + maior);
        System.out.println("O menor numero é" + menor);
        System.out.println("A soma é" + soma);
        System.out.println("A media é" + media);
        System.out.println("O vetor é" + valoresArray);

    }
}
