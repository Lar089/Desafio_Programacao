package view.screen;

import model.LadderModel;
import view.interfaces.IMenu;
import view.messages.Message;

import java.util.Scanner;
/**
 * Classe menu da ferramenta Ladder, pede a inserção de um número.
 * @author Carol
 * @implements IMenu é uma interface que possue o método ShowMenu.
 */
public class LadderScreen implements IMenu {
    /**
     * Mostra o menu da ferramente Ladder
     * @return option um número inseriada pelo usuário
     */
    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in);
        int option;
        do {
            System.out.println("Neste tópico o usuário deve informar o tamanho da escada \n" +
                    "e como resposta recebe uma escada de tamanho n, que é \n" +
                    "formado pelo caracter '*'  " +
                    "\n\tOBS: Pressione a tecla zero(0) para sair desta operação\n");
            System.out.println("Informe o tamanho da Escada:");
            option = Integer.parseInt(read.nextLine());

            if(option != 0)
                return "" + option;

        } while (option != 0);
        return "" + option;
    }

    /**
     * Método que mostra a resposta em forma de
     * escada de caractere '*'.
     * @param ladder objeto Ladder
     */
    public void Result(LadderModel ladder){
        System.out.println(Message.RESULT.getMessage());
        for (int i = 0; i < ladder.getN(); i++){
            for (int j = 0; j < ladder.getN();j++){
                System.out.print(ladder.getResult()[i][j]);
            }
            System.out.print("\n");
        }
    }
}
