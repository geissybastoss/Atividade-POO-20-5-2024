package exercicio27;

public class Main {
    
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {
        // Calcula a área do quadrado usando o 
        //método estático calcularArea() da classe Calculadora
        double area = Calculadora.calcularArea();
        
        // Exibe a área calculada do quadrado
        System.out.println("Área do quadrado: " + area);
    }
}
