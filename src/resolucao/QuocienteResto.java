package resolucao;

import java.util.Scanner;

public class QuocienteResto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcular quociente e resto da divisão");
        System.out.println("*************************************");
        System.out.println("Digite o dividendo: ");
        int dividendo = sc.nextInt();
        System.out.println("Digite o divisor: ");
        int divisor = sc.nextInt();

        if(divisor != 0){
            System.out.printf("Quociente de %d/%d = %d | resto = %d",
                    dividendo,
                    divisor,
                    dividendo/divisor,
                    dividendo%divisor);
        }else{
            System.out.println("Não é possível dividir por 0");
        }
        sc.close();
    }
}
