/*
Faça um algoritmo que pergunte quanto a pessoa ganha por hora (salário por hora)
e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no
referido mês e qual será seu salário atual. Calcule também o salário líquido
(desconto de impostos) considerando 15% de impostos e mostre esses valores.
a. Pergunte ao usuário qual a % de imposto que é descontada do salário.
 */
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora? ");
        float ganhaHora = in.nextFloat();
        System.out.println("Trabalha quantas horas por mês? ");
        float horasTrabalhadas = in.nextFloat();


        float totalSalario = ganhaHora * horasTrabalhadas;
        float descontoImposto = (float) (totalSalario * 0.15);
        float salarioComImposto = totalSalario - descontoImposto;

        System.out.println("o salario mensal da pessoa é: " + totalSalario);
        System.out.println("O desconto do imposto é: " + descontoImposto);
        System.out.printf("O salário líquido após desconto de imposto é: R$ %.2f%n", salarioComImposto);




    }
}
