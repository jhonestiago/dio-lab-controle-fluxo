import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Instancia da classe Scanner
        Scanner scanner = new Scanner(System.in);

        // Solicita dois número inteiros ao usuário
        System.out.println("Digite o primeiro numero inteiro:");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int segundoNumero = scanner.nextInt();

        // Executa o tratamento de exceções
        try {
            // Tenta realizar a contagem com os números fornecidos
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            // Captura a exceção e exibe uma mensagem de erro ao usuário
            System.err.println("Erro: " + e.getMessage());
        }

        // Fecha o scanner para liberar o recurso
        scanner.close();

    }
    
    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        // Verifica se o segundo número é menor que o primeiro
        if (segundoNumero < primeiroNumero) {
            String mensagem = "O segundo número (" + segundoNumero + ") deve ser maior que o primeiro (" + primeiroNumero + ")";
            throw new ParametrosInvalidosException(mensagem);
        } else {
            // Estabelece o limite superior do intervalo de contagem e imprime os números 
            int contagem = segundoNumero - primeiroNumero;
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}