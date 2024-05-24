package exercicio20;

public class Main {
    
       // Método principal onde a execução do programa começa
       public static void main(String[] args) {
        // Cria uma instância da classe Quadrado com o lado especificado
        Quadrado quadrado = new Quadrado(5);
        
        // Calcula e exibe a área do quadrado utilizando o método calcularArea()
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
    }
}
