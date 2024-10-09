import java.util.Scanner;
public class Carro {
    // método MAIN, executado sempre que o pgm inicializa
    public static void main (String[] args) {
        String marca, modelo, cor;
        int velocAtual=20;
        int opcao=1;

        Scanner scanner = new Scanner(System.in); 

        System.out.println("Digite a marca do veículo: ");
        marca = scanner.next(); 
        System.out.println("Digite a modelo do veículo: ");
        modelo = scanner.next();

        System.out.println("Digite a cor do veículo: ");
        cor = scanner.next();


        while (opcao != 3) { // enquanto usuário não digitar 3, o pgm não para
            System.out.println("\n---------------------------------");
            System.out.println("Automóvel: 001");
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Cor: " + cor);
            System.out.println("Velocidade Atual: " + velocAtual + " km/h");

            System.out.println("\nO que deseja fazer?");
            System.out.println("1 - Acelerar");
            System.out.println("2 - Frear");
            System.out.println("3 - SAIR");
            System.out.print("Digite uma opção:");
            opcao = scanner.nextInt();
            
            // de acordo com a opção que usuário digitar
            switch (opcao) {
                case 1: velocAtual = acelerar(velocAtual);
                        break;

                case 2: velocAtual = frear(velocAtual);
                        break;

                case 3: sair();
                        break;

                default: System.out.println("Opção digitada está incorreta");
            }
        }

        scanner.close();
    } // fim do MAIN

    //novos métodos ficam fora do MAIN

    // métodos para acelerar o carro
    public static int acelerar (int velocAtual) {
        velocAtual = velocAtual + 10;
        return velocAtual;
    }

    // método para frear o carro
    public static int frear (int velocAtual) {
        // caso o caro esteja parado
        if (velocAtual == 0) {
            velocAtual = 0;
            return velocAtual;
        } else { // carro não está parado
            // caso o carro já esteja em movimento
            velocAtual = velocAtual - 5;
            return velocAtual;
        }

    }

    // método SAIR - mensagem de despedida e fechar o pgm
    public static void sair() {
        
    }

}