package controller.service;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por manipular a entrada e gerar os subs anagramas.
 * @author Carol
 */
public class AnagramService {
    private List listResult = new ArrayList<>();
    private List wordsList = new ArrayList<>();

    /**
     * Método que gera o resultado de quantos sub anagramas uma palavra possui
     * @param word palavra de entrada
     * @return result o número de pares de sub anagramas que uma palavra possui.
     */
    public int SubAnagram(String word) {
        int result = 0;
        String word1, word2;
        CreateAnagram(word);
        /**
         * Verifiva se os anagramas gerados são pares
         * e guarda na lista listResult para que os pares
         * não sejam repetidos.
         */
        for (int i = 0; i < wordsList.size(); i++)
            for (int j = 0; j < wordsList.size(); j++) {
                word1 = wordsList.get(i).toString();
                word2 = wordsList.get(j).toString();

                if (word1.length() == word2.length() && i != j)
                    if (!listResult.contains(word1) && !listResult.contains(word2)) {
                        if (IsAnagram(word1, word2)) {
                            listResult.add(word1);
                            listResult.add(word2);
                            result += 1;
                        }
                    }
            }
        return result;
    }

    /**
     * Cria todos os anagramas possíveis de uma
     * palavra e guarda na lista wordsList
     * @param word palavra de entrada
     */
    private void CreateAnagram(String word) {
        for (int i = 0; i <= word.length(); i++)
            for (int j = i; j <= word.length(); j++)
                if (i != j)
                    wordsList.add(word.substring(i, j));
    }

    /**
     * Médoto responsável por verificar se duas sub palavras são anagramas
     * @param word1 primeira palavra que vai ser comparada
     * @param word2 segunda palavra que vai ser comparada
     * @return retorna verdadeiro ou falso para a comparação dos dois anagramas.
     */
    private static boolean IsAnagram(String word1, String word2) {
        int result = 0;
        int resultCheck = 0;

        for (int i = 0; i < word1.length(); i++)
            result = word1.charAt(i) ^ result;

        for (int i = 0; i < word2.length(); i++)
            result = word2.charAt(i) ^ result;
        /**
         * Pos conta de um bug, foi necessário fazer uma segunda comparação,
         * pois algumas palavras totalmente diferente estavam passando como
         * anagramas. Ex de bug: ifai e uhkq.
         */
        if (result == 0)
            for (int i = 0; i < word1.length(); i++)
                for (int j = 0; j < word2.length(); j++)
                    if (word1.charAt(i) == word2.charAt(j))
                        resultCheck++;

        if (resultCheck < word1.length())
            return false;
        return (result == 0);
    }
}
