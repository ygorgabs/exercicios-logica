package resolucao;

import java.util.Scanner;

public class ReajusteValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double reajuste = 0.05;
        System.out.print("Digite o valor a ser reajustado: ");
        double valor = scanner.nextDouble();
        System.out.printf("O valor reajustado em %.0f porcento é: %.2f",(reajuste*100), (valor+valor*reajuste));
    }
}
