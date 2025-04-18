/*
 * O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%,
escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o
custo final ao consumidor.

 */
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o custo de fábrica do carro?");
        float custoFabrica = in.nextFloat();

        float custoCarroNovo = (float) (custoFabrica * (0.28 + 0.45));
        float custoCarroNovo2 = custoCarroNovo + custoFabrica;

        System.out.println("Custo final: " +custoCarroNovo2);


    }
}
