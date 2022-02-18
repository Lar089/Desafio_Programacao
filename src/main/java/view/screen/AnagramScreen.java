package view.screen;

import model.AnagramModel;
import view.interfaces.IMenu;
import view.messages.Message;

import java.util.Scanner;

/**
 * Classe menu da ferramenta Anagrama, pede a inserção de uma palavra.
 * @author Carol
 * @implements IMenu é uma interface que possue o método ShowMenu.
 */
public class AnagramScreen implements IMenu {
    /**
     * Mostra o menu da ferramente Anagrama
     * @return option é uma palavra inseriada pelo usuário
     */
    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in);
        String option;
        do {
            System.out.println("Neste tópico a entrada é uma palavra \n" +
                    "e como resposta recebe a quantidade de pares de anagramas de \n" +
                    "suas substrings podem formar" +
                    "\n\tOBS: Pressione a tecla zero(0) para sair desta operação\n");
            System.out.println("Informe a palavra:");
            option = read.nextLine();

            if(!option.equals("0"))
                return option;

        } while (!option.equals("0"));
        return option;
    }

    /**
     * Método que mostra a resposta em forma de número
     * @param word objeto Anagrama
     */
    public void Result(AnagramModel word){
        System.out.println(Message.RESULT.getMessage());
        System.out.println(word.getResult());
    }
}
