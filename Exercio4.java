package lista12;

import java.util.Scanner;

public class Exercio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números deseja informar? ");
        int qtd = sc.nextInt();
        int pares = 0, impares = 0;

        for (int i = 0; i < qtd; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0) pares++;
            else impares++;
        }

        System.out.println("Pares: " + pares + " | Ímpares: " + impares);
    }
}
