
/*
Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
que diga se ela poderá ou não votar este ano (não é necessário considerar o mês
em que a pessoa nasceu).

 */
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento");
        int nascimentoAno = in.nextInt();
        System.out.println("Digite o ano atual");
        int anoAtual = in.nextInt();

        int podeVotar = anoAtual - nascimentoAno;

        if (podeVotar >= 16) {
            System.out.println("Pode votar");
            System.out.println("Idade da pessoa: " + podeVotar);

        } else {
            System.out.println("Não pode votar");
        }

    }
}
