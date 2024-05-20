package exercicio11;

public class Main {
    
    public static void main(String[] args) {
        // Instancia um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa();

        // Define o atributo idade do objeto Pessoa com um valor válido
        pessoa.setIdade(25);

        // Tenta definir o atributo idade com um valor inválido
        pessoa.setIdade(-5); // Isso deve exibir uma mensagem de erro

        // Imprime o valor do atributo idade
        System.out.println("Idade da pessoa: " + pessoa.getIdade());
    }
}
