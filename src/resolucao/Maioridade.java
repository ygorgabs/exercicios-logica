package resolucao;

import java.util.Scanner;

public class Maioridade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digita a idade: ");
        int idade = sc.nextInt();
        System.out.println("----------------------------------------");
        System.out.printf("%s é %s.",nome, idade >= 18 ? "maior de idade" : "menor de idade");
        sc.close();
    }
}
