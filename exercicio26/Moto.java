package exercicio26;

public class Moto extends Veiculo {
    // Atributo privado
    private String modelo;

    // Construtor com dois parâmetros
    public Moto(String marca, String modelo) {
        // Chama o construtor da classe base (Veiculo)
        super(marca);
        this.modelo = modelo;
    }

    // Método para imprimir os valores dos atributos
    public void imprimir() {
        System.out.println("Marca da moto: " + marca);
        System.out.println("Modelo da moto: " + modelo);
    }
    
}
