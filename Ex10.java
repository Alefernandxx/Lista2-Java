
/*
 * 0. Faça um programa que receba a idade de um nadador e classifique-o numa das
seguintes categorias:
• Adulto (idade >= 18);
• Juvenil (idade >= 14 e idade < 18);
• Infantil (idade >=9 e idade < 14);
• Mirim (Idade < 9).
 */
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("adulto");
            
        } else if (idade >= 14 && idade < 18) {
            System.out.println("Juvenil");
            
        } else if (idade >= 9 && idade < 14) {
            System.out.println("Infantil");
            
        } else if (idade < 9) {
            System.out.println("Infantil");
            
        }

    }
}
