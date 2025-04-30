package lista12;

import java.util.Scanner;

public class Exercio1 {
    public static void main(Exercio1[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        sc.close();
    }
}
