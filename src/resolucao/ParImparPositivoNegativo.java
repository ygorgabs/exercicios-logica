package resolucao;

import java.util.Scanner;

public class ParImparPositivoNegativo {
    public static void main(String[] args) {
        System.out.println("Digite um valor: ");
        int valor = new Scanner(System.in).nextInt();

        System.out.printf("O valor digitado foi: %d. É um número %s e %s",
                valor,
                valor % 2 == 0 ? "Par":"Impar",
                valor < 0 ? "Negativo":"Positivo");
    }
}
