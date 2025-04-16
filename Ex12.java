/*
 * As maçãs custam R$ 1.50 cada se forem compradas menos de uma dúzia, e R$
1.30 se forem compradas pelo menos 12. Escreva um programa que leia o número
de maçãs compradas, calcule e escreva o custo total da compra.
 */
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero de maças compradas");
        int maça = in.nextInt();

        if (maça < 12) {
            float preçoMaça = (float) (maça * 1.50);
            System.out.println("Preço Total: ");
            System.out.println(preçoMaça);

            
        } else if (maça == 12) {
            float preçoMaça2 = (float) (maça * 1.30);
            System.out.println("Preço total: ");
            System.out.println(preçoMaça2);
            
        }

    }
}
