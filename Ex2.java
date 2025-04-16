
/*
Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área e o perímetro do retângulo.
*/
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        float base = in.nextFloat();
        System.out.println("Digite o valor da altura: ");
        float altura = in.nextFloat();

        float area = base * altura;
        float perimetro = (base + altura) * 2;

        System.out.println(area);
        System.out.println(perimetro);

    }
}
