package resolucao;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit, celsius;

        System.out.println("Conversor de temperatura");
        System.out.println("************************");
        System.out.println("Digite a temperatura em Fahrenheit: ");
        fahrenheit = sc.nextDouble();
        celsius =  5*(fahrenheit-32)/9;
        System.out.printf("A temperatura é: %.0f°C",celsius);
        sc.close();
    }
}
