package exercicio19;

public class Pessoa {
    
     // Atributos privados da classe
     private String nome;
     private int idade;
 
     // Construtor da classe que inicializa os atributos nome e idade
     public Pessoa(String nome, int idade) {
         this.nome = nome;
         this.idade = idade;
     }
 
     // Método getter para o atributo nome
     public String getNome() {
         return nome;
     }
 
     // Método setter para o atributo nome
     public void setNome(String nome) {
         this.nome = nome;
     }
 
     // Método getter para o atributo idade
     public int getIdade() {
         return idade;
     }
 
     // Método setter para o atributo idade
     public void setIdade(int idade) {
         this.idade = idade;
     }
}
