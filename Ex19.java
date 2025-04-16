
/*
 * Escreva um algoritmo para ler as dimensões de uma cozinha retangular
(comprimento, largura e altura), calcular e escrever a quantidade de caixas de
azulejos para se colocar em todas as suas paredes (considere que não será
descontada a área ocupada por portas e janelas). Cada caixa de azulejos possui 1.5
m2 .

 */
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o comprimento");
        float comprimento = in.nextFloat();
        System.out.println("Digite a largura");
        float largura = in.nextFloat();
        System.out.println("Digite a altura");
        float altura = in.nextFloat();

        float calculo = 2 * (comprimento * altura);
        float calculo2 = 2 * (largura * altura);

        float areaTotal = calculo + calculo2;
        float azulejo = (float) 1.5;

        int quantAzulejos = (int) (areaTotal / azulejo);

        System.out.println("Serão necessárias " +quantAzulejos + " caixas de azulejos");


    }
}
