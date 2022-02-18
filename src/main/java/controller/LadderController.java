package controller;

import controller.service.LadderService;
import model.LadderModel;
import view.messages.Message;
import view.messages.Restriction;
import view.screen.LadderScreen;
/**
 * Classe resposável por controlar o fluxo de dados da ferramenta Ladder
 * @author Carol
 * Instância as classes Service, Restriction, Screen e Model da Ladder.
 */
public class LadderController {
    public String[][] result;
    LadderService service = new LadderService();
    Restriction restriction = new Restriction();
    LadderScreen screen = new LadderScreen();
    LadderModel ladder;

    /**
     * Cosntrutor do controlador da ferramenta Ladder
     * @param n número inserida pelo usuário em forma de string
     * Convert a string em número através do método ValueConvert.
     * Verifica as restrições de entrada feito pela classe
     * Restriction, instancia o objeto ladder,
     * chama o método da classe Service que gera a matriz com o resultado.
     * O resultado é setado no objeto ladder e a classe
     * screen mostra o resultado.
     */
    public LadderController(String n){
        int value = service.ValueConvert(n);
        Message message = restriction.RestrictionLadder(value);
        if(message.equals(Message.SUCCESS) ) {
            ladder = new LadderModel(value);
            result = service.Matrix(ladder.getN());
            ladder.setResult(result);
            screen.Result(ladder);
        }
    }
}