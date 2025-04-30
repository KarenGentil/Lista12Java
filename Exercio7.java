package lista12;

import java.util.Scanner;

public class Exercio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        for (int num = inicio; num <= fim; num++) {
            boolean primo = true;
            if (num < 2) continue;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) System.out.println(num);
        }

    }
}
