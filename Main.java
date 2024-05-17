import java.util.Scanner;

public class Main
{
        public static void main(String[] args) {
        int i, n, soma, subtracao, multiplicacao,  divisao;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        i = scanner.nextInt();
        
        soma= i + n;
        subtracao= i - n;
        multiplicacao= i * n;
        divisao= i / n;
        
        System.out.println("Resultado ");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        
    }
}