package exercicio10;

public class Aluno {
    
      // Atributos privados da classe Aluno
      private String nome;
      private double nota;
  
      // Construtor da classe que inicializa os atributos nome e nota
      public Aluno(String nome, double nota) {
          this.nome = nome;
          this.nota = nota;
      }
  
      // Método getter para o atributo nome
      public String getNome() {
          return nome;
      }
  
      // Método setter para o atributo nome
      public void setNome(String nome) {
          this.nome = nome;
      }
  
      // Método getter para o atributo nota
      public double getNota() {
          return nota;
      }
  
      // Método setter para o atributo nota
      public void setNota(double nota) {
          this.nota = nota;
      }
}
