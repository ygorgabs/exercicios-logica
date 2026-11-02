package resolucao;

import java.util.Scanner;

public class TabuadaInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro para calcular a tabuada: ");
        int num = scanner.nextInt();
        System.out.printf("Tabuada do %d%n", num);
        System.out.println("**********************************");
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n",num,i,num*i);
        }
        scanner.close();
    }
}
