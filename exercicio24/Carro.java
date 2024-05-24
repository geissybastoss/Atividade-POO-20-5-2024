package exercicio24;

public class Carro extends Veiculo {
    // Atributo privado específico da classe Carro que armazena o modelo do carro
    private String modelo;

    // Construtor da classe Carro que inicializa a marca e o modelo do carro
    public Carro(String marca, String modelo) {
        // Chama o construtor da classe base (Veiculo) para inicializar a marca do veículo
        super(marca);
        // Inicializa o modelo do carro
        this.modelo = modelo;
    }

    // Método getter para obter o modelo do carro
    public String getModelo() {
        return modelo;
    }
}

