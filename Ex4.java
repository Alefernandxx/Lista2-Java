
/*
Escreva um programa que faça a leitura de dois valores inteiros e descubra qual
deles é o maior, imprimindo na resposta o nome da variável e o seu valor.
 */
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        int valor1 = in.nextInt();
        System.out.println("Digite o valor 2");
        int valor2 = in.nextInt();

        if (valor1 > valor2) {
            System.out.println("O valor1 = " + valor1 + " é maior ");

        } else if (valor2 > valor1) {
            System.out.println("o valor2 = " + valor2 + " é maior");

        }
        {

        }

    }
}
