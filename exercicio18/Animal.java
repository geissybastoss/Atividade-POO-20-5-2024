package exercicio18;

public class Animal {
    
    // Atributos da classe Animal
    private String nome;
    private int idade;

    // Construtor da classe Animal
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos get para nome e idade
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Métodos set para nome e idade
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
