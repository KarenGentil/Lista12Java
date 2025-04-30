package lista12;

import java.util.Scanner;

public class Exercio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        String num = sc.nextLine();
        int zeros = 0;

        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                zeros++;
            }
        }

        System.out.println("Quantidade de zeros: " + zeros);
    }
}
