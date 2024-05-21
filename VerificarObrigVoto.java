import java.util.Scanner;

public class VerificarObrigVoto{
    public static void main(String[] args) {
    int idade;
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    idade = scanner.nextInt();

    if (idade >= 18 && idade <= 70)
    System.out.println("Você é obrigado a votar");
    if ((idade >= 16 || idade < 18) || (idade > 70))
    System.out.println("Seu voto é facultativo");
    if (idade < 16)
    System.out.println("Você não precisa votar");

    }
}