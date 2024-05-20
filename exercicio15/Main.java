package exercicio15;

public class Main {
    
    public static void main(String[] args) {
        // Cria uma nova instância de Endereco com a rua "Rua ABC" e número 123
        Endereco endereco = new Endereco("Rua ABC", 123);

        // Cria uma nova instância de Pessoa com o endereço criado acima
        Pessoa pessoa = new Pessoa(endereco);

        // Imprime a rua e o número do endereço da pessoa
        System.out.println("Rua: " + pessoa.getEndereco().getRua());
        System.out.println("Número: " + pessoa.getEndereco().getNumero());
    }
}
