package exercicio15;

public class Endereco {
    
        // Atributos privados da classe Endereco
        private String rua;
        private int numero;
    
        // Construtor da classe que inicializa os atributos rua e numero
        public Endereco(String rua, int numero) {
            this.rua = rua;
            this.numero = numero;
        }
    
        // Método getter para o atributo rua
        public String getRua() {
            return rua;
        }
    
        // Método setter para o atributo rua
        public void setRua(String rua) {
            this.rua = rua;
        }
    
        // Método getter para o atributo numero
        public int getNumero() {
            return numero;
        }
    
        // Método setter para o atributo numero
        public void setNumero(int numero) {
            this.numero = numero;
        }
}
