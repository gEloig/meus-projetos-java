import java.util.Scanner;

public class ExibirTabuada
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero de que você deseje ver a tabuada:");
        int n = scanner.nextInt();
        
        for (int i = 0; i <= 10 ; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        scanner.close();
    }
}