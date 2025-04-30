package lista12;

import java.util.Scanner;

public class Exercio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int soma = 0;

        for (int n = numero; n > 0; n /= 10) {
            soma += n % 10;
        }

        System.out.println("Soma dos dígitos: " + soma);

    }
}
