/*
 * Uma revendedora de carros usados paga a seus funcionários vendedores um salário
fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5%
do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de
carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele
recebe por carro vendido. Calcule e escreva o salário final do vendedor.

 */
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o numero de carros vendidos");
        int carrosVendidos = in.nextInt();
        System.out.println("O valor total de vendas");
        float valorTotalVendas = in.nextFloat();
        System.out.println("Digite o salário fixo");
        float salarioFixo = in.nextFloat();
        System.out.println("Valor que recebe por carro vendido");
        float comissaoCarroVendido = in.nextFloat();

        float calculo = (float) (carrosVendidos * comissaoCarroVendido);
        float calculo2 = (float) (valorTotalVendas * 0.05);
        float salarioFinal = (float) (calculo + calculo2 + salarioFixo);

        System.out.println("salario final: " + salarioFinal);


    }
}
