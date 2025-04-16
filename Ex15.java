
/*
 * Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas
inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o
tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um
dia e terminar no dia seguinte
 */
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a hora de inicio do jogo: ");
        int horaInicio = in.nextInt();
        System.out.println("Digite a hora do fim do jogo");
        int horaFim = in.nextInt();

        int duracaoJogo;

        if (horaFim == horaInicio) {
            duracaoJogo = 24;

        } else if (horaFim > horaInicio) {
            duracaoJogo = horaFim - horaInicio;

        } else {
            duracaoJogo = (horaFim - horaInicio) + 24;
        }

        System.out.println("O jogo durou: " + duracaoJogo + " horas ");

    }
}

