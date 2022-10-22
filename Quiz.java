import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Quiz {

    static Scanner input = new Scanner(System.in);

    // MÉTODO PARA APRESENTAR O MENU E AS OPÇÕES AO USUÁRIO E OBTER A ESCOLHA
    public static int menu() {
        int opcao;

        do {
            System.out.println();
            System.out.println("---------------- MENU -----------------");
            System.out.println("---------------------------------------");
            System.out.println("|                                     |");
            System.out.println("|           1- INTRUÇÕES              |");
            System.out.println("|           2- JOGAR                  |");
            System.out.println("|           3- CRÉDITOS               |");
            System.out.println("|           4- SAIR                   |");
            System.out.println("|                                     |");
            System.out.println("--------------------------------------");

            System.out.println();
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            opcao = input.nextInt();

            System.out.print("\033[H\033[2J");// LIMPA O CONSOLE APÓS ESCOLHA

            if (opcao < 1 || opcao > 4) {
                System.out.println("OPÇÃO INVÁLIDA!");
            }
        } while (opcao < 1 || opcao > 4);

        return opcao;
    }

    // MÉTODO CONTROLADOR PARA RETORNAR OS MÉTODOS DE ACORDO COM A ESCOLHA DO
    // USUÁRIO NO MENU
    public static void controlador(int opcao) { // AQUI ELE RECEBE O PARAMETRO OPCAO COMO VARIÁVEL INTEIRA PARA VALIDAR
                                                // OS CASES
        switch (opcao) {
            case 1:
                instrucoes();
                break;

            case 2:
                jogar();
                break;

            case 3:
                creditos();
                break;

            case 4:
                sair();
                break;
        }
    }

    // MÉTODO PARA RETORNAR AS INSTRUÇÕES AO USUÁRIO
    public static void instrucoes() {
        System.out.println();
        System.out.println("O QUIZ SERÁ COMPOSTO DE 10 PERGUNTAS COM 4 ALTERNATIVAS CADA");
        System.out.println();
    }

    // MÉTODO PRINCIPAL PARA INICIAR O QUIZ
    public static void jogar() {
        pergunta1();
    }

    public static String getPerguntas(int indice) {
        String perguntas[] = new String[10];
        // VETOR DE PERGUNTAS
        perguntas[0] = "1- QUEM FOI O MAIOR ARTILHEIRO DAS COPAS DO MUNDO ATÉ O MOMENTO?";
        perguntas[1] = "2- QUEM SÃO OS MAIORES CAMPEÕES DA COPA DO MUNDO?";
        perguntas[2] = "3- QUANDO FOI REALIZADO A ÚLTIMA COPA DO MUNDO ATÉ O MOMENTO?";
        perguntas[3] = "4- QUEM FOI O JOGADOR MAIS CONVOCADO PARA AS COPAS DO MUNDO ATÉ O MOMENTO?";
        perguntas[4] = "5- QUAL É O ÚNICO JOGADOR QUE JÁ PARTICIPOU DE 3 FINAIS DA COPA DO MUNDO SEGUIDAS?";
        perguntas[5] = "6- QUAL PAÍS GANHOU A PRIMEIRA COPA DO MUNDO?";
        perguntas[6] = "7- QUAL O JOGADOR COM MAIS TÍTULOS DA COPA DO MUNDO?";
        perguntas[7] = "8- QUAL A SELEÇÃO QUE MARCOU O GOL MAIS RÁPIDO NUMA COPA DO MUNDO?";
        perguntas[8] = "9- QUANDO ACONTECEU A PRIMEIRA COPA DO MUNDO NO BRASIL?";
        perguntas[9] = "10- EM QUAL ESTÁDIO FOI A ABERTURA DA COPA DO MUNDO EM 2014?";
        String retorno = perguntas[indice];
        return retorno;
    }

    // MÉTODO SEPARADO PARA PERGUNTA NÚMERO 1
    public static void pergunta1() {
        String resposta;
        boolean acerto = false;
        int tentativas = 0;
        List<String> alternativas = new ArrayList<String>();

        alternativas.add("Miroslav Klose"); // RESPOSTA CORRETA
        alternativas.add("Ronaldo");
        alternativas.add("Gerd Müller");
        alternativas.add("Just Fontaine");

        do {
            Collections.shuffle(alternativas);
            System.out.println();
            System.out.println(getPerguntas(1));
            System.out.println();
            System.out.println("a) " + alternativas.get(0)); // RESPOSTA CORRETA
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            System.out.println();
            resposta = input.next();

            switch (resposta) {
                case "a":
                case "A":
                    System.out.println();
                    System.out.println(
                            "!--------- VOCÊ SELECIONOU ALTERNATIVA " + resposta.toUpperCase() + " ---------!");
                    tentativas++;
                    if (alternativas.get(0) == "Miroslav Klose") {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA CORRETA ---------!");
                        acerto = true; // VARIÁVEL BOOLEANA PARA CONFERIR RESPOSTA CORRETA
                    } else {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA INCORRETA ---------!");
                    }
                    break;

                case "b":
                case "B":
                    System.out.println();
                    System.out.println(
                            "!--------- VOCÊ SELECIONOU ALTERNATIVA " + resposta.toUpperCase() + " ---------!");
                    tentativas++;
                    if (alternativas.get(1) == "Miroslav Klose") {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA CORRETA ---------!");
                        acerto = true; // VARIÁVEL BOOLEANA PARA CONFERIR RESPOSTA CORRETA
                    } else {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA INCORRETA ---------!");
                    }
                    break;

                case "c":
                case "C":
                    System.out.println();
                    System.out.println(
                            "!--------- VOCÊ SELECIONOU ALTERNATIVA " + resposta.toUpperCase() + " ---------!");
                    tentativas++;
                    if (alternativas.get(2) == "Miroslav Klose") {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA CORRETA ---------!");
                        acerto = true; // VARIÁVEL BOOLEANA PARA CONFERIR RESPOSTA CORRETA
                    } else {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA INCORRETA ---------!");
                    }
                    break;

                case "d":
                case "D":
                    System.out.println();
                    System.out.println(
                            "!--------- VOCÊ SELECIONOU ALTERNATIVA " + resposta.toUpperCase() + " ---------!");
                    tentativas++;
                    if (alternativas.get(3) == "Miroslav Klose") {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA CORRETA ---------!");
                        acerto = true; // VARIÁVEL BOOLEANA PARA CONFERIR RESPOSTA CORRETA
                    } else {
                        System.out.println();
                        System.out.println("!--------- RESPOSTA INCORRETA ---------!");
                    }
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }

            if (tentativas == 3) {
                System.out.println();
                System.out.println("VOCÊ ESGOTOU A QUANTIDADE DE TENTATIVAS!");
                System.out.println();
                break;
            }

        } while (tentativas < 3 && !acerto);

    }

    // MÉTODO PARA RETORNAR OS CRÉDITOS
    public static void creditos() {
        System.out.println("\n****************************CRÉDITOS*****************************");
        System.out.println("\nEste Quiz foi desenvolvido pelos alunos:"
                + "\n*Igor Gonçalves Lima"
                + "\n*John Brandy"
                + "\n*Rony Anderson"
                + "\n*Leonardo Silva Nascimento"
                + "\n*Lucas Serrato Bonito"
                + "\n\nMatéria: Projeto Integrador I"
                + "\n\nCurso: Tecnologia em Análise e Desenvolvimento de Sistemas"
                + "\n\nTurma: C | Período: Noturno | Ano: 2022"
                + "\n\nInstituição de ensino: Centro Universitário Senac - Santo Amaro");
        System.out.println("\n*****************************************************************");
    }

    // MÉTODO PARA FINALIZAR O PROGRAMA
    public static void sair() {
        System.out.println("\n*****************");
        System.out.println("SESSÃO FINALIZADA");
        System.out.println("*****************");
        System.exit(0);
    }

    public static void main(String[] args) {
        int opcaoEscolhida;

        System.out.println();
        System.out.println("**************************");
        System.out.println("Seja Bem Vindo(a) ao Quiz Copa do Mundo!");
        System.out.println();

        do {
            opcaoEscolhida = menu();

            controlador(opcaoEscolhida);
        } while (opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3 || opcaoEscolhida == 4);
    }

}