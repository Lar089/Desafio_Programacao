package view.screen;

import model.PasswordModel;
import view.interfaces.IMenu;
import view.messages.Message;

import java.util.Scanner;
/**
 * Classe menu da ferramenta Password, pede a inserção de uma senha.
 * @author Carol
 * @implements IMenu é uma interface que possue o método ShowMenu.
 */
public class PasswordScreen implements IMenu {
    /**
     * Mostra o menu da ferramente Password
     * @return option é uma senha inseriada pelo usuário
     */
    @Override
    public String ShowMenu() {
        Scanner read = new Scanner(System.in,"UTF-8");
        String option;
        do {
            System.out.println("Neste tópico o usuário deve informar uma senha \n" +
                    "e como resposta recebe a quantidade de caracteres que falta \n" +
                    "para a senha ser forte. \n" +
                    "\n\tOBS: Pressione a tecla zero(0) para sair desta operação\n");
            System.out.println("Informe a senha:");
            option = read.nextLine();

            if(!option.equals("0"))
                return option;

        } while (!option.equals("0"));
        return option;
    }
    /**
     * Método que mostra a resposta com o número de caractere
     * que falta para a senhar ser forte.
     * @param password objeto Password
     */
    public void Result(PasswordModel password){
        System.out.println(Message.RESULT.getMessage());
        System.out.println(password.getResult());
    }
}
