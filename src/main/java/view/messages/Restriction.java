package view.messages;

/**
 * Classe responsável por mostrar mensagens de erro por restição.
 * @author Carol
 */
public class Restriction {
    /**
     * Método de restrição da ferramente Ladder, restringe o valor de entrada da ferramenta
     * @param n é o valor de entrada, não pode ser negativo.
     * Mostra a restrição no console e
     * @return retorna uma mensagem.
     */
    public Message RestrictionLadder(int n){
        if (n < 0){
            System.out.println(Message.ERROR.getMessage() + " Valor não pode ser inferior a 0");
            return Message.ERROR;
        }
        return Message.SUCCESS;
    }

    /**
     * Método de restrição da ferramente Anagrama, restringe o valor de entrada da ferramenta
     * @param word é a palavra de entrada, não pode ser menor que 2.
     * Mostra a restrição no console e
     * @return retorna uma mensagem.
     */
    public Message RestrictionAnagram(String word){
        if (word.length() <= 2){
            System.out.println(Message.ERROR.getMessage() + " A palavra precisa ter mais de 2 letras!");
            return Message.ERROR;
        }
        for (int i = 0; i < word.length(); i++)
            if (Character.isDigit(word.charAt(i))){
                System.out.println(Message.ERROR.getMessage() + " A palavra não pode ter números!");
                return Message.ERROR;
            }
        return Message.SUCCESS;
    }
}
