package controller;

import controller.service.AnagramService;
import model.AnagramModel;
import view.messages.Message;
import view.messages.Restriction;
import view.screen.AnagramScreen;
/**
 * Classe resposável por controlar o fluxo de dados da ferramenta Anagram
 * @author Carol
 * Instância as classes Service, Restriction, Screen e Model do Anagram.
 */
public class AnagramController {
    public int result = 0;
    AnagramService service = new AnagramService();
    Restriction restriction = new Restriction();
    AnagramScreen screen = new AnagramScreen();
    AnagramModel wordAnagram;

    /**
     * Cosntrutor do controlador da ferramenta Anagram
     * @param word palavra inserida pelo usuário
     * Instancia o objeto wordAnagram, verifica as restrições
     * de entrada feito pela classe Restriction,
     * chama o método da classe Service que gera o resultado.
     * O resultado é setado no objeto wordAnagram e a classe
     * screen mostra o resultado.
     */
    public AnagramController(String word) {
        if (!word.equals("0")) {
            wordAnagram = new AnagramModel(word);
            Message message = restriction.RestrictionAnagram(word);
            if (message.equals(Message.SUCCESS)) {
                result = service.SubAnagram(word);
                wordAnagram.setResult(result);
                screen.Result(wordAnagram);
            }
        }
    }
}
