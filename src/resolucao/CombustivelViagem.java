package resolucao;

import java.util.Scanner;

public class CombustivelViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double velocidadeMedia, tempoGasto, distanciaPercorrida, litrosUsados;
        final double KM_LITRO = 12;

        System.out.println("Calcule a quantidade de combustível gasto na viagem");
        System.out.println("****************************************************");
        System.out.println("Digite a velocidade média(em Km/h): ");
        velocidadeMedia = scanner.nextDouble();
        System.out.println("Digite o tempo gasto na viagem(em horas): ");
        tempoGasto = scanner.nextDouble();

        distanciaPercorrida = velocidadeMedia * tempoGasto;
        litrosUsados = distanciaPercorrida/KM_LITRO;
        System.out.println("****************************************************");
        System.out.printf("Tempo de viagem: %.1f horas%nVelocidade média: %.2f Km/h%nDistância percorrida: %.2f Km%nCombustível usado: %.2f litros",
                tempoGasto,
                velocidadeMedia,
                distanciaPercorrida,
                litrosUsados);
        scanner.close();
    }
}
