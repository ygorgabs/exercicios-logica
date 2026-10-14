package resolucao;

import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        int valor = new Scanner(System.in).nextInt();
        System.out.printf("O número digitado foi: %d%nSeu sucessor é: %d%nSeu antecessor é: %d",
                valor,
                valor+1,
                valor-1);
    }
}
