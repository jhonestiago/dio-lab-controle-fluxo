import java.lang.Exception;

// Cria uma nova classe de exceção chamada ParametrosInvalidosException
public class ParametrosInvalidosException extends Exception {
    
    // ID para serialização
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de erro
    // E a passa para a classe pai (Exception)
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); 
    }

}

