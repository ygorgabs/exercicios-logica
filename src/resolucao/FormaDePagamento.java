package resolucao;

import java.util.Scanner;

public class FormaDePagamento {
    public static void main(String[] args) {
        double valorProduto = 0, valorRecalculado = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de Pagamento");
        System.out.println("********************");
        System.out.println("Digite o valor do produto: ");
        valorProduto = sc.nextDouble();
        System.out.printf("Selecione a forma de pagamento:%n1 - A vista Dinheiro ou Pix (15%% desconto)%n2 - A vista Crédito (10%% desconto)%n3 - Parcelado até 2x no Crédito%n4 - Parcelado em 3x ou mais no Crédito (Juros 10%%)%n");
        int opcao = sc.nextInt();

        while (opcao < 1 || opcao > 4){
            System.out.println("Opção inválida. Digite uma opção de 1 a 4: ");
            opcao = sc.nextInt();
        }

        switch (opcao){
            case 1:
                valorRecalculado = valorProduto * (1 - 0.15); break;
            case 2:
                valorRecalculado = valorProduto * (1 - 0.1); break;
            case 3:
                valorRecalculado = valorProduto; break;
            case 4:
                valorRecalculado = valorProduto * (1 + 0.1); break;
        }

        System.out.printf("Valor a ser pago: R$%.2f",valorRecalculado);
        sc.close();
    }
}
