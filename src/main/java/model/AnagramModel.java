package model;
/*Descrção da questão
# Questão 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um
algoritmo que encontre o número de pares de substrings que são anagramas.

Entrada:
ovo
Saída:
3

Explicação:
A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0, 2], [0, 1],
[1, 2]] respectivamente.
 */

/**
 * Classe base da ferramenta Anagrama
 * @author Carol
 * Declara as variáveis de entrada e de saída.
 */
public class AnagramModel {
    private String word;
    private int result;

    public AnagramModel(String word){
        super();
        setWord(word);
    }

    public String getWord(){ return word; }

    public void setWord(String word){ this.word = word; }

    public int getResult(){
        return result;
    }

    public void setResult(int result){
        this.result = result;
    }
}
