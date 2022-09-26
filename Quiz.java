import java.util.*;

public class Quiz {

    static Scanner input = new Scanner(System.in);

    // MÉTODO PARA APRESENTAR O MENU E AS OPÇÕES AO USUÁRIO E OBTER A ESCOLHA
    public static int menu() {
        int opcao;

        do {
            System.out.println("1- INTRUÇÕES");
            System.out.println("2- JOGAR");
            System.out.println("3- CRÉDITOS");
            System.out.println("4- SAIR");

            System.out.println();
            System.out.print("DIGITE A OPÇÃO DESEJADA: ");
            opcao = input.nextInt();

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

    // MÉTODO PARA INICIAR O QUIZ
    public static void jogar() {
        System.out.println();
        System.out.println("************BOA SORTE************");
        System.out.println("PRIMEIRA PERGUNTA: NEYMAR JOGOU NESSA COPA ?");
        System.out.println("1 - SIM");
        System.out.println("2 - NÃO");
        System.out.println();
    }

    // MÉTODO PARA RETORNAR OS CRÉDITOS
    public static void creditos() {
        System.out.println("\n****************************CRÉDITOS*****************************");
        System.out.println("\nEste QUIZ textual foi desenvolvido pelos alunos:"
                + "\n*Igor Gonçalves Lima"
                + "\n*Jhon"
                + "\n*Rony"
                + "\n*Léo"
                + "\n*Lucas"
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
    }

    public static void main(String[] args) {
        int opcaoEscolhida;

        System.out.println();
        System.out.println("**************************");
        System.out.println("Seja Bem Vindo(a) ao Quiz!");
        System.out.println();

        do {
            opcaoEscolhida = menu();

            controlador(opcaoEscolhida);
        } while (opcaoEscolhida != 4);
    }

}