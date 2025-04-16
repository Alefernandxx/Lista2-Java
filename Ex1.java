
/*
Faça um algoritmo que converta metros para centímetros. Lembrando que 1m =
100cm
 */
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite os metros");
        float metros = in.nextFloat();

        float conversao = metros * 100;

        System.out.println("Resultado = " + conversao);

    }
}
