package exercicio18;

public class Peixe extends Animal {

     // Atributo específico da classe Peixe
     private String caracteristica;

     // Construtor da classe Peixe
     public Peixe(String nome, int idade, String caracteristica) {
         // Chama o construtor da classe base (Animal)
         super(nome, idade);
         // Inicializa o atributo específico da classe Peixe
         this.caracteristica = caracteristica;
     }
 
     // Método get para caracteristica
     public String getCaracteristica() {
         return caracteristica;
     }
 
     // Método set para caracteristica
     public void setCaracteristica(String caracteristica) {
         this.caracteristica = caracteristica;
     }
 
     // Método dadosPeixe para imprimir os dados do peixe
     public void dadosPeixe() {
         System.out.println("Nome: " + getNome());
         System.out.println("Idade: " + getIdade() + " anos");
         System.out.println("Característica: " + caracteristica);
     }
}
