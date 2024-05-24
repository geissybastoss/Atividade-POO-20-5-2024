package exercicio24;

public class Main {
    
        // Método principal onde a execução do programa começa
        public static void main(String[] args) {
            // Cria uma instância da classe Carro com a marca "Ford" e o modelo "Focus"
            Carro carro = new Carro("Ford", "Focus");
            
            // Exibe a marca do carro utilizando o método getMarca()
            System.out.println("Marca: " + carro.getMarca());
            
            // Exibe o modelo do carro utilizando o método getModelo()
            System.out.println("Modelo: " + carro.getModelo());
        }
}
