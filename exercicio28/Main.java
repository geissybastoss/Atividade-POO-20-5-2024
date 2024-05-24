package exercicio28;

public class Main {
    
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {
        // Calcula a área do quadrado
        double areaQuadrado = Calculadora.calcularArea(5);
        
        // Calcula a área do círculo
        double areaCirculo = Calculadora.calcularArea(3, true);

        // Exibe a área calculada do quadrado
        System.out.println("Área do quadrado: " + areaQuadrado);
        
        // Exibe a área calculada do círculo
        System.out.println("Área do círculo: " + areaCirculo);
    }
}
