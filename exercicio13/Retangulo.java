package exercicio13;

public class Retangulo {
        // Atributos privados da classe Retangulo
        private double largura;
        private double altura;
    
        // Construtor da classe que inicializa os atributos largura e altura
        public Retangulo(double largura, double altura) {
            this.largura = largura;
            this.altura = altura;
        }
    
        // Método getter para o atributo largura
        public double getLargura() {
            return largura;
        }
    
        // Método setter para o atributo largura
        public void setLargura(double largura) {
            this.largura = largura;
        }
    
        // Método getter para o atributo altura
        public double getAltura() {
            return altura;
        }
    
        // Método setter para o atributo altura
        public void setAltura(double altura) {
            this.altura = altura;
        }
    
        // Método para calcular a área do retângulo
        public double getArea() {
            return largura * altura;
        }
}
