/*
 * . Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito.
Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito).
Também testar se saldo atual for maior ou igual a zero escrever a mensagem “Saldo
Positivo”, senão escrever a mensagem “Saldo Negativo”.

 */
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero da conta do cliente");
        int numeroConta = in.nextInt();

        System.out.println("Digite o saldo da conta");
        float saldo = in.nextInt();
        System.out.println("Digite o débito da conta");
        float debito = in.nextFloat();
        System.out.println("Digite o crédito da conta");
        float credito = in.nextFloat();

        float saldoAtual = saldo - debito + credito;

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
            System.out.println(saldoAtual);
            
        } else {
            System.out.println("Saldo negativo");
            System.out.println(saldoAtual);
        }
    }
}
