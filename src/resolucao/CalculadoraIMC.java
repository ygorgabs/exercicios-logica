package resolucao;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculadora de IMC");
        System.out.println("*******************");
        System.out.println("Digite a altura (em metros): ");
        double altura = sc.nextDouble();
        System.out.println("Digite o peso (em Kg): ");
        double peso = sc.nextDouble();
        double imc = peso/Math.pow(altura,2);

        System.out.printf("IMC: %.2f%n",imc);
        if(imc > 40){
            System.out.println("Obesidade grau III (mórbida)");
        }else if(imc > 35){
            System.out.println("Obesidade grau II (severa)");
        }else if(imc > 30){
            System.out.println("Obesidade grau I");
        }else if(imc > 25){
            System.out.println("Levemente acima do peso");
        }else if(imc > 18.6){
            System.out.println("Peso ideal (Parabéns)");
        }else{
            System.out.println("Abaixo do peso");
        }
    }
}
