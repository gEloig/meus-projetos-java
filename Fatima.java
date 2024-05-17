import java.util.Scanner;

public class Fatima
{
        public static void main(String[] args) {
        int n=0, f=1
        ;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        n = scanner.nextInt();
        
        for (int i = n; i == 1; i--){
            f = f * i;
        }
        System.out.print("O Fatorial de " + n + " é " + f);
        scanner.close();
    }
}   