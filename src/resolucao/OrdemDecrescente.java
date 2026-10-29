package resolucao;

import java.util.Arrays;
import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 3 números para saber qual o maior");
        System.out.println("*****************************************************************");
        int[] valores = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o %dº valor: ",i+1);
            valores[i] = scanner.nextInt();
        }

        for (int i = 0; i < valores.length; i++) {
            for(int j = i+1; j < valores.length; j++){
                if(valores[i] > valores[j]){
                    int troca = valores[i];
                    valores[i] = valores[j];
                    valores[j] = troca;
                }
            }
        }

        System.out.println("Os números em ordem decrescente: " + Arrays.toString(valores));
    }
}
