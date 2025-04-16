
/*
 * Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
(considerar que média igual ou maior que 6.0 o aluno é aprovado). Escrever também
a média calculada.
 */
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a nota da 1a ");
        float nota1A = in.nextFloat();
        System.out.println("Digite a nota da 2a ");
        float nota2A = in.nextFloat();

        float mediaAritmetica = (nota1A + nota2A) /2;
        
        if (mediaAritmetica >= 6) {
            System.out.println("Aluno aprovado");
            System.out.println(mediaAritmetica);
            
        } else {
            System.out.println("Reprovado");
            System.out.println(mediaAritmetica);
        }

    }
}
