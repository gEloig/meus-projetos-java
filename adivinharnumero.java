import java.util.Scanner;
import java.util.Random;

public class adivinharnumero {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        
        int numeroAleatorio, numeroUsuario;

        numeroAleatorio = rd.nextInt(11);

        while (numeroAleatorio != numeroUsuario) {
            System.out.print("Tente acertar o numero de 0 a 10: ");
            numeroUsuario = scan.nextInt();

            if (numeroAleatorio == numeroUsuario) {
                System.out.print("Você acertou!");
            } else {
                System.out.print("Você errou!");

            }
        }
    }
}
