package exercicio16;

public class Carro extends Veiculo {

        // Atributo privado específico da classe Carro
        private String placa;

        // Construtor da classe Carro que inicializa os atributos marca, modelo e placa
        public Carro(String marca, String modelo, String placa) {
            // Chama o construtor da classe base (Veiculo) para inicializar marca e modelo
            super(marca, modelo);
            // Inicializa o atributo placa
            this.placa = placa;
        }
    
        // Método getter para o atributo placa
        public String getPlaca() {
            return placa;
        }
    
        // Método setter para o atributo placa
        public void setPlaca(String placa) {
            this.placa = placa;
        }
    
}
