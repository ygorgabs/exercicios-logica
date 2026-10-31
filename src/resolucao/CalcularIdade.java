package resolucao;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de idade");
        System.out.println("********************");
        System.out.print("Digite o dia de nascimento: ");
        int dia = sc.nextInt();
        System.out.print("Digite o número do mês de nascimento: ");
        int mes = sc.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        int ano = sc.nextInt();

        LocalDate dataNasc = LocalDate.of(ano,mes,dia);
        LocalDate hoje = LocalDate.now();

        Period period = Period.between(dataNasc, hoje);
        System.out.printf("%d anos, %d meses e %d dias de vida",period.getYears(),period.getMonths(),period.getDays());
        sc.close();
    }
}
