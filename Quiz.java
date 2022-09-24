import java.util.*;

public class Quiz {

    static Scanner input = new Scanner(System.in);

    public static int menu() {
        int opcao;

        System.out.println("1- INTRUÇÕES");
        System.out.println("2- JOGAR");
        System.out.println("3- CRÉDITOS");
        System.out.println("4- SAIR");

        System.out.println("DIGITE A OPÇÃO DESEJADA");
        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("BEM VINDO AS INSTRUÇÕES DO QUIZ");
                break;

            case 2:
                System.out.println("BEM VINDO AO JOGO!");
                break;

            case 3:
                System.out.println("BEM VINDO AOS CRÉDITOS...");
                break;

            case 4:
                System.out.println("SAINDO...");
                break;
        }

        if (opcao > 4 || opcao < 1) {
            System.out.println("OPÇÃO INVÁLIDA");
        }

        return opcao;
    }

    public static void main(String[] args) {
        int opcaoEscolhida;

        System.out.println("Seja Bem Vindo(a) ao Quiz!");

        do {
            opcaoEscolhida = menu();
        } while (opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3);
    }

}