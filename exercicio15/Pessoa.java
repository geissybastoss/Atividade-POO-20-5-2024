package exercicio15;

public class Pessoa {
    
      // Atributo privado da classe Pessoa que referencia um objeto Endereco
      private Endereco endereco;

      // Construtor da classe que inicializa o atributo endereco
      public Pessoa(Endereco endereco) {
          this.endereco = endereco;
      }
  
      // Método getter para o atributo endereco
      public Endereco getEndereco() {
          return endereco;
      }
  
      // Método setter para o atributo endereco
      public void setEndereco(Endereco endereco) {
          this.endereco = endereco;
      }
}
