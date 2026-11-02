package resolucao;

import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horaAula, aulasMes, inss, salarioLiquido;
        System.out.println("Calculo do salário de professor");
        System.out.println("*******************************");

        System.out.println("Digite o valor da hora aula: ");
        horaAula = sc.nextDouble();
        System.out.println("Digite a quantidade de aulas lecionadas: ");
        aulasMes = sc.nextDouble();
        System.out.println("Digite a porcentagem do desconto INSS: ");
        inss = sc.nextDouble() / 100;

        salarioLiquido = (horaAula * aulasMes) * (1 - inss);
        System.out.printf("O salário líquido do professor será: R$%.2f",salarioLiquido);
        sc.close();
    }
}
