package exercicio22;

public class Main {
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {
        // Chama o método estático somar da classe Calculadora para somar dois números
        int resultadoSoma = Calculadora.somar(10, 5);
        
        // Chama o método estático subtrair da classe Calculadora para subtrair dois números
        int resultadoSubtracao = Calculadora.subtrair(10, 5);
        
        // Exibe o resultado da soma
        System.out.println("Resultado da soma: " + resultadoSoma);
        
        // Exibe o resultado da subtração
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
    }
}
