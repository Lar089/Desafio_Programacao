package controller;

import controller.service.PasswordService;
import model.PasswordModel;
import view.screen.PasswordScreen;
/**
 * Classe resposável por controlar o fluxo de dados da ferramenta Password
 * @author Carol
 * Instância as classes Service, Screen e Model da Ladder.
 */
public class PasswordController {
    public int resultFull = 0;
    PasswordService service = new PasswordService();
    PasswordScreen screen = new PasswordScreen();
    PasswordModel password;
    /**
     * Cosntrutor do controlador da ferramenta Password
     * @param word palavra inserida pelo usuário
     * Instancia o objeto password, chama o método da classe
     * Service que gera a quantidade de restrições que a senha possui.
     * Chama novamente a classe Service para gerar o resultado.
     * O resultado é setado no objeto password e a classe
     * screen mostra o resultado.
     */
    public PasswordController(String word){
        if(!word.equals("0")) {
            password = new PasswordModel(word);

            int length = service.PasswordLength(word);
            int result = 0;

            for (int i = 0; i < length; i++) {
                char charA = word.charAt(i);
                result += service.RestrictionPassword(charA);
            }
            resultFull = service.Result(result, length);
            password.setResult(resultFull);
            screen.Result(password);
        }
    }

}
