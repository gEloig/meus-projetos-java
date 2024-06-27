import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        String NomeUsuario;
        char[] Respostas = new char[10];
        int OpcaoUsuario=0, LimiteRespostas=0, Pontuacao=0, Posicao=0;
        char[] Gabarito = {'C', 'B', 'A', 'B', 'C', 'A', 'D', 'C', 'D', 'C'};
        String Perguntas[] = {
            "QUIZ 1. Qual é a capital do Brasil?\nA) São Paulo\nB) Rio de Janeiro\nC) Brasília\nD) Salvador",
            "QUIZ 2. Qual é o maior planeta do sistema solar?\nA) Terra\nB) Júpiter\nC) Saturno\nD) Marte",
            "QUIZ 3. Quem escreveu 'Dom Casmurro'?\nA) Machado de Assis\nB) José de Alencar\nC) Clarice Lispector\nD) Graciliano Ramos",
            "QUIZ 4. Qual é o elemento químico representado pelo símbolo 'O'?\nA) Ouro\nB) Oxigênio\nC) Osso\nD) Ósmio",
            "QUIZ 5. Em que ano o homem pisou na Lua pela primeira vez?\nA) 1959\nB) 1965\nC) 1969\nD) 1971",
            "QUIZ 6. Qual é o animal mais rápido do mundo?\nA) Guepardo\nB) Leopardo\nC) Cavalo\nD) Águia",
            "QUIZ 7. Qual é o maior oceano da Terra?\nA) Atlântico\nB) Índico\nC) Ártico\nD) Pacífico",
            "QUIZ 8. Qual é a língua mais falada no mundo?\nA) Espanhol\nB) Inglês\nC) Mandarim\nD) Hindi",
            "QUIZ 9. Qual é o país mais populoso do mundo?\nA) Índia\nB) Estados Unidos\nC) Indonésia\nD) China",
            "QUIZ 10. Quem pintou a Mona Lisa?\nA) Vincent van Gogh\nB) Pablo Picasso\nC) Leonardo da Vinci\nD) Michelangelo"
        };
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("CARREGANDO O QUIZ GAME >>>>>>");
        System.out.println(">>>>>> QUAL É O SEU NOME? ");
        NomeUsuario = scanner.nextLine();
        System.out.println("----------------------------------------------------------------");
        System.out.println("###### BEM VINDO AO QUIZ GAME - " + NomeUsuario + " ######");
        System.out.println(">>>>>> DICA: Ultilize letra maiuscula em cada resposta das perguntas <<<<<<");
        System.out.println("Gostaria de jogar?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        System.out.print(">>>>>> Digite uma opção: ");
        OpcaoUsuario = scanner.nextInt();

        while(OpcaoUsuario == 1) {
         System.out.println(Perguntas[Posicao]);
            System.out.print("Sua resposta é: ");
            Respostas[Posicao] = scanner.next().charAt(0);
            Posicao++; 
            LimiteRespostas++;
        

                if (LimiteRespostas == 10) {
                    for (int indice = 0; indice < Gabarito.length; indice++) {
                        if (Gabarito[indice] == Respostas[indice]) {
                        Pontuacao = Pontuacao + 1;
                        }
                    }

                        if (Pontuacao <= 6 && Pontuacao != 0) {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Sua pontuação é:" + Pontuacao + "\nPoderia ser melhor não acha?");

                        }
                        if (Pontuacao > 6 && Pontuacao != 10) {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Sua pontuação é:" + Pontuacao + "\nParabens!");
                        }
                        if (Pontuacao == 0) {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Sua pontuação é:" + Pontuacao + "\n0 . . . é sério?");

                        }
                        if (Pontuacao == 10) {
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Sua pontuação é:" + Pontuacao + "\nPARABENS!!!! VOCÊ FOI INCRÍVEL!!!!!!!");

                        }
                        break;

                }

            if (OpcaoUsuario == 2) {
                System.out.println("----------------------------------------------------------------");
                System.out.println("Saindo do QUIZ GAME em 3 . . . 2 . . . 1 . . . - Até a próxima:");
            }
        } scanner.close();

    
    }
}