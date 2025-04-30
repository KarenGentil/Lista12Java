package lista12;

import java.util.Scanner;

public class Exercio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números vai digitar? ");
        int n = sc.nextInt();
        int[] lista = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            lista[i] = sc.nextInt();
        }

        System.out.println("Em ordem inversa:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(lista[i]);
        }
    }
}
