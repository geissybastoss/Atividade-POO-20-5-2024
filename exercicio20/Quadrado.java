package exercicio20;

// A classe Quadrado herda da classe Figura
public class Quadrado extends Figura {
    // Atributo privado específico da classe Quadrado
    private double lado;

    // Construtor da classe Quadrado que inicializa o atributo lado
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Método para calcular a área do quadrado
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
