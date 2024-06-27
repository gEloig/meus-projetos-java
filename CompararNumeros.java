import java.util.Scanner;

public class CompararNumeros{
    public static void main(String[] args) {
    int numero1, numero2;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite 1* número: ");
    numero1 = scanner.nextInt();
    System.out.print("Digite 2* número: ");
    numero2 = scanner.nextInt();

    if (numero1 > numero2)
    System.out.println("O 1* é maior");
    if (numero1 == numero2)
    System.out.println("Os números são iguais");
    if (numero1 < numero2)
    System.out.println("O 2* é maior");
    scanner.close();
    }
}