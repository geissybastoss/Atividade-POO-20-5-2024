package exercicio27;

public class Calculadora extends Matematica {
    // Método estático para calcular a área de um quadrado
    public static double calcularArea() {
        // Supondo um lado de 5 unidades para o quadrado
        double lado = 5;
        // Calcula a área do quadrado
        return lado * lado;
    }
}
