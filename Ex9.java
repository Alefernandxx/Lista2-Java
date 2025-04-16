
/*
 * Escreva um programa que pergunte o raio de uma circunferência, e sem seguida
mostre o diâmetro, comprimento e área da circunferência. Considere PI = 3.141692
 */
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência");
        float raio = in.nextFloat();

        float pi = (float) 3.141692;

        float diametroCircunferencia = 2 * raio;
        float comprimentoCircunferencia = 2 * pi * raio;
        float areaCircunferencia = pi * (raio * raio);

        System.out.println("O diametro é: " + diametroCircunferencia);
        System.out.println("O comprimento é: " + comprimentoCircunferencia);
        System.out.println("A área é: " + areaCircunferencia);

    }
}
