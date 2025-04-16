
/*
 * Uma empresa abriu uma linha de crédito para os funcionários. O valor da prestação
não pode ultrapassar 30% do salário. Faça um programa que receba o salário, o
valor do empréstimo e o número de prestações e informe se o empréstimo pode ser
concedido. Nenhum dos valores informados pode ser zero ou negativo.

 */
import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor do salário");
        float salario = in.nextFloat();
        System.out.println("Digite o valor do empréstimo");
        float emprestimo = in.nextFloat();
        System.out.println("Digite o numero de prestações");
        int prestacoes = in.nextInt();

        float limite = (float) (salario * 0.30);
        float calculoPrestacao = emprestimo / prestacoes;

        if (calculoPrestacao > limite) {
            System.out.println("Emprestimo não concedido");
            System.out.println("Valor da prestação: " + calculoPrestacao);

        } else {
            System.out.println("Emprestimo concedido");
            System.out.println("Valor da prestação: " + calculoPrestacao);

        }
        {

        }
    }
}
