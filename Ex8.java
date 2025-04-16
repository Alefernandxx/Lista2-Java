/*
 * Escreva um algoritmo para ler o número total de eleitores de um município, o
número de votos brancos, nulos e válidos. Calcular e escrever o percentual que
cada um representa em relação ao total de eleitores
 */
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o total de eleitores");
        int totalEleitores = in.nextInt();
        System.out.println("Votos brancos");
        int brancos = in.nextInt();
        System.out.println("Votos nulos");
        int nulos = in.nextInt();
        System.out.println("Votos válidos");
        int validos = in.nextInt();

        float calculoBrancos = ((float)brancos / totalEleitores) * 100;
        float calculoNulos = ((float)nulos/totalEleitores) * 100;
        float calculoValidos = ((float)validos/totalEleitores) * 100;

        System.out.println("Percentual de votos brancos " + calculoBrancos + "%");
        System.out.println("Percentual de votos nulos " + calculoNulos + "%");
        System.out.println("Percentual de votos válidos " + calculoValidos + "%");

    }
}
