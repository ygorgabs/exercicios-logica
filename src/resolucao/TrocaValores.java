package resolucao;

import java.util.Scanner;

public class TrocaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor B: ");
        int b = sc.nextInt();

        int troca = a;
        a = b;
        b = troca;

        System.out.println("Troca feita:");
        System.out.printf("O valor A é = %d. O valor B é = %d",a,b);
        sc.close();
    }
}
