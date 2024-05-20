package exercicio26;

public class Carro extends Veiculo {
    // Atributo privado
    private String modelo;

    // Construtor com dois parâmetros
    public Carro(String marca, String modelo) {
        // Chama o construtor da classe base (Veiculo)
        super(marca);
        this.modelo = modelo;
    }

    // Método para imprimir os valores dos atributos
    public void imprimir() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Modelo do carro: " + modelo);
    }
    
}
