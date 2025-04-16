/*
 * Faça um programa que receba dois números e efetua a adição. Caso o valor
somado seja maior que 20, este deverá ser apresentado somando-se a ele 8; caso
o valor somado seja menor ou igual a 20, este deverá ser apresentado subtraindo-se
10.

 */
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite dois numeros");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int soma = num1 + num2;

        if (soma > 20) {
            int soma8 = soma + 8;
            System.out.println(soma8);
            
        } else if (soma <= 20) {
            int subtracao10 = soma - 10;
            System.out.println(subtracao10);
            
        }

    }
}
