package exercicio19;

// A classe Funcionario herda da classe Pessoa
public class Funcionario extends Pessoa {
    // Atributo privado específico da classe Funcionario
    private String cargo;

    // Construtor da classe Funcionario que inicializa os atributos nome, idade e cargo
    public Funcionario(String nome, int idade, String cargo) {
        // Chama o construtor da classe base (Pessoa) para inicializar nome e idade
        super(nome, idade);
        // Inicializa o atributo cargo
        this.cargo = cargo;
    }

    // Método getter para o atributo cargo
    public String getCargo() {
        return cargo;
    }

    // Método setter para o atributo cargo
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}