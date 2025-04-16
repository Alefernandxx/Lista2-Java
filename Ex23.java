
/*
 * Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em
estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
quantidade média, usando a seguinte fórmula: ((quantidade média = quantidade
máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a
quantidade média escrever a mensagem “Não efetuar compra”, senão escrever a
mensagem “Efetuar compra”.

 */
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade atual em estoque");
        int quantAtualEstoque = in.nextInt();
        System.out.println("Digite a quantidade máxima em estoque");
        int quantMaxEstoque = in.nextInt();
        System.out.println("Digite a quantidade minima em estoque");
        int quantMinEstoque = in.nextInt();

        int quantidadeMedia = (quantMaxEstoque + quantMinEstoque) / 2;

        if (quantAtualEstoque >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
            System.out.println("Quantidade Média: " + quantidadeMedia);

        } else {
            System.out.println("Efetuar compra");
            System.out.println("Quantidade Média: " + quantidadeMedia);
        }
    }
}
