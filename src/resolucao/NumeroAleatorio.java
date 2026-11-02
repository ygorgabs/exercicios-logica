package resolucao;

import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        System.out.println("Pressione enter para obter um número aleatório de 0 a 100");
        new Scanner(System.in).nextLine();
        double aleatorio = Math.random() * 100;
        System.out.printf("Número sorteado: %.0f",aleatorio);
    }
}
