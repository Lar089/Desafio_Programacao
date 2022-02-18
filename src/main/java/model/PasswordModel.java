package model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/*Descrição da questão
# Questão 02
Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A
página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser
forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

● Possui no mínimo 6 caracteres.
● Contém no mínimo 1 digito.
● Contém no mínimo 1 letra em minúsculo.
● Contém no mínimo 1 letra em maiúsculo.
● Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Entrada:
Ya3
Saída:
3

Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando
a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho
mínimo de 6 caracteres.

 */
/**
 * Classe base da ferramenta Password
 * @author Carol
 * Declara as variáveis de entrada e de saída.
 */
public class PasswordModel {
    private String password;
    private int result;

    public PasswordModel(String password){
        super();
        setPassword(password);
    }

    public String getPassword(){ return password; }

    public void setPassword(String password){ this.password = password; }

    public int getResult(){
        return result;
    }

    public void setResult(int result){
        this.result = result;
    }

}
