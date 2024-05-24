package exercicio16;

public class Veiculo {

        // Atributos privados da classe
        private String marca;
        private String modelo;
    
        // Construtor da classe que inicializa os atributos marca e modelo
        public Veiculo(String marca, String modelo) {
            this.marca = marca;
            this.modelo = modelo;
        }
    
        // Método getter para o atributo marca
        public String getMarca() {
            return marca;
        }
    
        // Método setter para o atributo marca
        public void setMarca(String marca) {
            this.marca = marca;
        }
    
        // Método getter para o atributo modelo
        public String getModelo() {
            return modelo;
        }
    
        // Método setter para o atributo modelo
        public void setModelo(String modelo) {
            this.modelo = modelo;
    
        }

    }