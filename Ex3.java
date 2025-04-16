/*
 * Ler um valor e escrever se é positivo ou negativo (considere o valor zero como
positivo).
 */
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor");
        int valor = in.nextInt();

        if (valor > 0) {
            System.out.println("positivo");
            
        } else {
            System.out.println("negativo");
        }


    }
}
