package resolucao;

public class AlcancarAltura {
    public static void main(String[] args) {
        int alturaFranciscoCm = 110, alturaSaraCm = 150, crescimentoFrancisco = 3, crescimentoSara = 2, contador = 0;

        while(alturaFranciscoCm <= alturaSaraCm){
            alturaFranciscoCm += crescimentoFrancisco;
            alturaSaraCm += crescimentoSara;
            contador++;
        }

        System.out.printf("Altura Francisco: %.2f metros%nAltura Sara: %.2f%nForam necessários %d anos para Francisco ultrapassar a altura de Sara.",
                alturaFranciscoCm/100.0,
                alturaSaraCm/100.0,
                contador);
    }
}
