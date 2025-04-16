
/*
 * Um motorista de táxi deseja calcular o rendimento de seu carro na praça.
Sabendo-se que o preço do combustível é de R$ 4.59, escreva um algoritmo para
ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia,
o número de litros de combustível gasto e o valor total (R$) recebido dos
passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido)
do dia
 */
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Marcação no inicio do dia");
        float inicio = in.nextFloat();
        System.out.println("Marcação no fim do dia");
        float fim = in.nextFloat();
        System.out.println("Numero de litros de combustível que gastou");
        float litrosGastos = in.nextFloat();
        System.out.println("Valor total recebido dos passageiros");
        float valorTotalPassageiros = in.nextFloat();

        float marcacao = (fim - inicio) / litrosGastos;
        float precoCombustivel = (float) 4.59;
        float calculo = precoCombustivel * litrosGastos;
        float lucroLiquido = valorTotalPassageiros - calculo;

        System.out.println("Média de consumo é " + marcacao + "km/L");
        System.out.printf("Lucro liquido: R$%.2f ", lucroLiquido);

    }
}
