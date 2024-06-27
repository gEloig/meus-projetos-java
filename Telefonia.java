import java.util.Scanner;

public class Telefonia{
    public static void main(String[] args) {
    int opcao;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Selecione o plano de celular que vc deseja: ");
    System.out.println("1 - Plano Básico (5Gb Youtube)");
    System.out.println("2 - Plano Plus (Adição de WhatsApp e Instagram grátis)");
    System.out.println("3 - Plano Premium (Adição de 100 minutos de ligação)\n");
    System.out.print("Opção: ");
    opcao = scan.nextInt();

    switch(opcao) {
        case 1: System.out.println("Parabéns! O Plano selecionado foi: \nPlano Básico (5Gb Youtube)");
        break ;
        case 2: System.out.println("Parabéns! O Plano selecionado foi: \nPlano Plus (Adição de WhatsApp e Instagram grátis)");
        break ;
        case 3: System.out.println("Parabéns! O Plano selecionado foi: \nPlano Premium (Adição de 100 minutos de ligação)");
        break ;
        default:
        System.out.println("Sua Opção é invalida");
        }
        scan.close();
    }
}