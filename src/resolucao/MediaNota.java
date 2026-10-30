package resolucao;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
        double somaNotas = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite a %dª nota: ",i+1);
            somaNotas += sc.nextDouble();
            contador++;
        }
        System.out.printf("A média do aluno foi: %.2f",somaNotas/contador);
        sc.close();
    }
}
