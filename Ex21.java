
/*
 * A equipe Red Bull Racing de Fórmula 1 deseja calcular o número mínimo de litros
que deverá colocar no tanque de seu carro para que ele possa percorrer um
determinado número de voltas até o primeiro reabastecimento. Escreva um
algoritmo que leia o comprimento da pista (em metros), o número total de voltas a
serem percorridas no grande prêmio, o número de reabastecimentos desejados e o
consumo de combustível do carro (em Km/L). Calcular e escrever o número mínimo
de litros necessários para percorrer até o primeiro reabastecimento. Observação:
Considere que o número de voltas entre os reabastecimentos é o mesmo.

 */
import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o comprimento da pista (em metros)");
        float metrosPista = in.nextFloat();
        System.out.println("Digite o total de voltas a serem percorridas");
        float totalVoltas = in.nextFloat();
        System.out.println("Digite o numero de reabastecimentos");
        float reabastecimentos = in.nextFloat();
        System.out.println("Digite o consumo de combustivel do carro");
        float consumoCombustivel = in.nextFloat();

        float conversaoKM = metrosPista / 1000;
        float calculo = totalVoltas * conversaoKM;
        float calculo2 = calculo / reabastecimentos;
        float calculo3 = calculo2 / consumoCombustivel;

        System.out.println("O numero minimo de litros necessários é de " + calculo3 + " litros ");

    }
}
