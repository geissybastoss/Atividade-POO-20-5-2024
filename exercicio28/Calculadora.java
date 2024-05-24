package exercicio28;

public class Calculadora {
    // Método estático para calcular a área genérica
    public static double calcularArea() {
        return 0;
    }

    // Método estático para calcular a área do quadrado
    public static double calcularArea(double lado) {
        return lado * lado; // Área do quadrado
    }

    // Método estático para calcular a área do quadrado ou do círculo
    public static double calcularArea(double raio, boolean isCirculo) {
        if (isCirculo) {
            return Math.PI * raio * raio; // Área do círculo
        } else {
            return 0; // Retorna 0 para outras formas geométricas
        }
    }
}

