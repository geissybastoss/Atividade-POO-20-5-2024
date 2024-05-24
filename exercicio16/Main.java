package exercicio16;

public class Main {
    
        // Método principal onde a execução do programa começa
        public static void main(String[] args) {

            // Cria uma instância da classe Carro com marca, modelo e placa especificados
            Carro carro = new Carro("Toyota", "Corolla", "ABC1234");
    
            // Exibe a marca do carro utilizando o método getMarca()
            System.out.println("Marca: " + carro.getMarca());
    
            // Exibe o modelo do carro utilizando o método getModelo()
            System.out.println("Modelo: " + carro.getModelo());
    
            // Exibe a placa do carro utilizando o método getPlaca()
            System.out.println("Placa: " + carro.getPlaca());
        }
}
