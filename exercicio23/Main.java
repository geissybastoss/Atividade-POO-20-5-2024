package exercicio23;

public class Main {
    
        // Método principal onde a execução do programa começa
        public static void main(String[] args) {
            // Cria uma instância da classe Calculadora
            Calculadora calculadora = new Calculadora();
            
            // Cria uma instância da classe CalculadoraCientifica
            CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();
            
            // Calcula a soma utilizando o método soma da classe Calculadora
            int resultadoSoma1 = calculadora.soma(5, 3);
            
            // Calcula a soma utilizando o método soma da classe CalculadoraCientifica
            int resultadoSoma2 = calculadoraCientifica.soma(5, 3, 2);
            
            // Exibe o resultado da soma utilizando a Calculadora
            System.out.println("Resultado da soma (Calculadora): " + resultadoSoma1);
            
            // Exibe o resultado da soma utilizando a CalculadoraCientifica
            System.out.println("Resultado da soma (CalculadoraCientifica): " + resultadoSoma2);
        }
}
