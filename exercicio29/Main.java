package exercicio29;

public class Main {
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {
        // Cria uma instância da classe Imprimir
        Imprimir printer = new Imprimir();
        
        // Imprime uma String
        printer.imprimirElemento("Olá, mundo!");
        
        // Imprime um número inteiro
        printer.imprimirElemento(10);
        
        // Imprime um número de ponto flutuante
        printer.imprimirElemento(3.14);
        
        // Imprime um valor booleano
        printer.imprimirElemento(true);
    }
}
