package controller.service;
/**
 * Classe responsável por manipular a entrada e gerar uma matriz de caractere '*'.
 * @author Carol
 */
public class LadderService {
    /**
     * Converte a string em inteiro
     * @param n string com o número de degraus da escada
     * @return retorna um número convertido
     */
    public int ValueConvert(String n){
        return Integer.parseInt(n);
    }

    /**
     * Método que gera a escada de caractere '*'
     * @param value tamanho da escada
     * @return retorna a matriz gerada.
     */
    public String[][] Matrix(int value){//value = 3
        String[][] m = new String[value][value];

        for (int i = 0; i < value; i++){
            for (int j = 0; j < value;j++){
                if(value - j == (i + 1))//3-0 == 0+1 / 3-1 == 0+1 / 3-2 == 0+1
                    m[i][j] = "*";
                if(value - i <= (j + 1))//3-1 <= 0+1 / 3-1 <= 1+1 / 3-1 <= 2+1
                    m[i][j] = "*";
                else
                    m[i][j] = " ";
            }
        }
        return m;
    }


}