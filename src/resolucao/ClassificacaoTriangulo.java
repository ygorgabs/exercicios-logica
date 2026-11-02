package resolucao;

import java.util.Scanner;

public class ClassificacaoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Classificação de triângulo");
        System.out.println("***************************");
        System.out.println("Digite a medida do lado A: ");
        a = sc.nextDouble();
        System.out.println("Digite a medida do lado B: ");
        b = sc.nextDouble();
        System.out.println("Digite a medida do lado C: ");
        c = sc.nextDouble();

        if(a < b+c && b < a+c && c < a+b){
            if(a==b && b==c)
                System.out.println("Triângulo equilátero.");
            else if(a==b || b==c || a==c)
                System.out.println("Triângulo isóceles");
            else
                System.out.println("Triângulo escaleno");
        }else{
            System.out.println("As medidas informadas não correspondem a um triângulo");
        }

        sc.close();
    }
}
