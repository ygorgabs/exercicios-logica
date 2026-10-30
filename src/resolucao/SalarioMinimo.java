package resolucao;

import java.util.Scanner;

public class SalarioMinimo {
    public static void main(String[] args) {
        double salarioMinimo = 1621.00;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário (R$): ");
        double salarioInput = scanner.nextDouble();
        System.out.printf("R$ %.2f é equivalente a %.2f salários mínimo.", salarioInput, salarioInput/salarioMinimo);
        scanner.close();
    }
}
