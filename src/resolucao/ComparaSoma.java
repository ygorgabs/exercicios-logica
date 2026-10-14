package resolucao;

import java.util.Scanner;

public class ComparaSoma {
    public static void main(String[] args) {
        int a, b, c, soma;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor A: ");
        a = scanner.nextInt();
        System.out.printf("%nDigite o valor B:");
        b = scanner.nextInt();
        System.out.printf("%nDigite o valor C: ");
        c = scanner.nextInt();
        soma = a + b;
        System.out.printf("A soma de A + B é: %d. Menor que C: %s", soma, soma < c ? "Sim":"Não");
    }
}
