package exercicio8;

public class Main {
    
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30);
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
