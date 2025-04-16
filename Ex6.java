/*
Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365
dias e mês com 30 dias. Calcular quantos dias a pessoa já viveu até hoje.
 */
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa");
        int idade = in.nextInt();
        System.out.println("Digite a idade em meses");
        int mes = in.nextInt();
        System.out.println("Digite a idade em dias");
        int dias = in.nextInt();

        int calculo = (idade * 365) + (mes * 30) + dias;

        System.out.println("A pessoa viveu em " +calculo +" dias ");
        


    }
}
