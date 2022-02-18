package view.messages;

/**
 * Classe enum responsável por ter as mensagens da aplicação.
 * @author Carol
 */
public enum Message {
    SUCCESS("Operação realizada com sucesso!"),
    ERROR("Valor de entrada inválida!"),
    TRY_AGAIN("Tente novamente!"),
    RESULT("Resultado"),
    BYE("Obrigado por utilizar está ferramenta!");

    private String message;

    /**
     * Contrutor da classe Messege
     * @param message retorna a mensagem escolhida do
     * tipo Messege.
     */
    Message(String message) {
        this.message = message;
    }

    /**
     * Método get que retorna a string da mensagem
     * @return messege retorna uma string coma mensagem
     * escolhida.
     */
    public String getMessage() {
        return this.message;
    }
}
