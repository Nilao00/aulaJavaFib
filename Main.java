import java.util.Scanner;

public class Main {
    //ola mundo
    public static void main(String[] args) {
        
        float num[] = new float[10];

        Scanner sc = new Scanner(System.in);
        float maior = num[0];
        float menor = num[0];
        float soma = num[0];
        String resultado = "Resultado " + num[0] + "\n";
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o numero" + (i + 1));
            num[i] = sc.nextFloat();
        }

        for (int i = 1; i < 10; i++) {

            if (num[i] > maior) {
                maior = num[i];
            }
            if (num[i] < menor) {
                menor = num[i];
            }
            soma += num[i];
            resultado += num[i] + "\n";
        }
        float media = soma / 10;
        System.out.println("O maior numero é" + maior);
        System.out.println("O menor numero é" + menor);
        System.out.println("A soma é" + soma);
        System.out.println("A media é" + media);
        System.out.println("O vetor é" + resultado);

    }
}
