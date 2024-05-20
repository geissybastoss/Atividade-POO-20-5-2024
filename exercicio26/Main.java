package exercicio26;

public class Main {
    
    public static void main(String[] args) {
        // Cria um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota", "Corolla");

        // Cria um objeto da classe Moto
        Moto minhaMoto = new Moto("Honda", "CBR600RR");

        // Imprime os valores dos atributos do carro
        meuCarro.imprimir();

        // Imprime os valores dos atributos da moto
        minhaMoto.imprimir();
    }
}
