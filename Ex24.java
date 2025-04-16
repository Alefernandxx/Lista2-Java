
/*
 * Escreva um programa que faça a leitura da idade de 2 homens e 2 mulheres
(supondo que as idades do mesmo sexo serão diferentes). O programa deve fazer o
somatório da idade do homem mais velho com a idade da mulher mais nova e o
produto da idade do homem mais novo pela idade da mulher mais velha. Ao final
você deve imprimir os resultados, e cada uma das idades digitadas: mulher mais
nova, mulher mais velha, homem mais novo e homem mais velho.
 */
import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade de 2 homens");
        int HomemMaisNovo = in.nextInt();
        int HomemMaisVelho = in.nextInt();
        System.out.println("Digite a idade de 2 mulheres");
        int MulherMaisNova = in.nextInt();
        int MulherMaisVelha = in.nextInt();

        int somarIdades = HomemMaisVelho + MulherMaisNova;
        int produto = HomemMaisNovo * MulherMaisVelha;

        System.out.println(somarIdades);
        System.out.println(produto);

    }
}
