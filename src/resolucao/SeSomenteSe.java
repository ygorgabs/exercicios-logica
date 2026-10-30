package resolucao;

import java.util.Scanner;

public class SeSomenteSe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite valores booleanos para verificar se ambos são iguais (Verdadeiro = true / Falso = false)");
        System.out.println("*****************************************************");
        System.out.print("Primeiro valor booleano: ");
        boolean valor1 = scanner.nextBoolean();
        System.out.print("Segundo valor booleano: ");
        boolean valor2 = scanner.nextBoolean();
        System.out.printf("Ambos os valores são iguais?%n%s",valor1 == valor2 ? "Verdadeiro" : "Falso");
        scanner.close();
    }
}
