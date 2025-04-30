package lista12;

import java.util.Scanner;

public class Exercio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0, count = 0;

        System.out.println("Digite números (negativo para sair):");

        for (;;) {
            int num = sc.nextInt();
            if (num < 0) break;
            soma += num;
            count++;
        }

        if (count > 0)
            System.out.println("Média: " + (soma / (double) count));
        else
            System.out.println("Nenhum valor válido inserido.");
    }
}
