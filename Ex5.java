/*
Escreva um programa que faça a leitura de dois valores reais e faça a divisão entre
eles se o denominador não for zero. Ao final deve ser impresso o resultado ou uma
mensagem de erro
 */
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor 1");
        float valorReal1 = in.nextFloat();
        System.out.println("Digite o valor 2");
        float valorReal2 = in .nextFloat();

        

        if (valorReal2 != 0) {
            float divisao = valorReal1 / valorReal2;
            System.out.println(divisao);
           
            
        } else {
            System.out.println("Erro: Divisao por zero");
        }


    }
}
