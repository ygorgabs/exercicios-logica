package resolucao;

public class Tabuada1a10 {
    public static void main(String[] args) {
        System.out.println("Tabuada do 1 ao 10");
        System.out.println("***********************************");
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
            System.out.println("***********************************");
        }
    }
}
