package lista12;

import java.util.Scanner;

public class Exercio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Início do intervalo: ");
        int ini = sc.nextInt();
        System.out.print("Fim do intervalo: ");
        int fim = sc.nextInt();
        int somaTotal = 0;

        for (int i = ini; i <= fim; i++) {
            if (i % 2 == 0) {
                int num = i;
                while (num > 0) {
                    somaTotal += num % 10;
                    num /= 10;
                }
            }
        }

        System.out.println("Soma dos dígitos dos pares: " + somaTotal);
    }
}
