package controller.service;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isLetterOrDigit;
/**
 * Classe responsável por manipular a entrada e gerar a quantidade de caracteres que falta
 * para que a senha seja forte.
 * @author Carol
 */
public class PasswordService {
    List list = new ArrayList<>();

    /**
     * Mostra o tamanho da palvra
     * @param password palavra de entrada
     * @return o tamanho da palavra
     */
    public int PasswordLength(String password) {
        return password.length();
    }

    /**
     * Método que guarda em uma lista quantas restrições a senha cumpri,
     * verifica-se qual é o tipo de caractere.
     * @param charValue um caractere da senha
     * @return retorna 1 se cumprir uma das restrições e guarda na lista
     * a restrição para que ela não se repita.
     */
    public int RestrictionPassword(char charValue) {
        if (!isLetterOrDigit(charValue)) {
            if (!list.contains(1)) {
                list.add(1);
                return 1;
            }
        } else {
            if (Character.isUpperCase(charValue)) {
                if (!list.contains(2)) {
                    list.add(2);
                    return 1;
                }
            }
            if (Character.isLowerCase(charValue)) {
                if (!list.contains(3)) {
                    list.add(3);
                    return 1;
                }
            }
            if (Character.isDigit(charValue)) {
                if (!list.contains(4)) {
                    list.add(4);
                    return 1;
                }
            }
        }
        return 0;
    }

    /**
     * Gera a quantidade de caracteres que falta para que a
     * senha seja mais forte.
     * @param value quantidade de criterios que a senha possui
     * @param length tamanho da senha
     * @return retorna q quantidade de caracteres que faltam na senha.
     */
    public int Result(int value, int length) {
        int auxLength = 6 - length;//6 tamanho minimo da senha
        int auxValue = 4 - value;//4 quantidade de criterios da senha

        if (length < 6) {
            if(auxLength <= auxValue){
                return auxValue;
            } else {
                return auxLength;
            }
        } else {
            return auxValue;
        }
    }

}
