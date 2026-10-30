package resolucao;

import java.util.Scanner;

public class SomarOuMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Somar ou Multiplicar:\n Soma: se os números forem iguais\nMultiplicação: caso sejam valores direfentes");
        System.out.println("------------------------------------------------------");
        System.out.print("Digite o primeiro número: ");
        a = scanner.nextInt();
        System.out.print("\nDigite o segundo número: ");
        b = scanner.nextInt();

        c = (a == b ? (a+b):(a*b));
        System.out.printf("O resultado é: %d",c);
        scanner.close();
    }
}
