package resolucao;

import java.util.Scanner;

public class MediaNota2 {
    public static void main(String[] args) {
        double somaNotas = 0, media;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc.nextLine();

        for (int i = 0; i < 4; i++) {
            System.out.printf("Digite a %dª nota: ",i+1);
            somaNotas += sc.nextDouble();
            contador++;
        }

        media = somaNotas/contador;
        System.out.printf("A média de %s foi: %.2f%nStatus: %s",
                nomeAluno,
                media,
                media >= 7.0 ? "Aprovado" : "Reprovado");
        sc.close();
    }
}
