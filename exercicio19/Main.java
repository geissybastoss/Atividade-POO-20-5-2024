package exercicio19;

public class Main {
    
    // Método principal onde a execução do programa começa
    public static void main(String[] args) {
        // Cria uma instância da classe Funcionario com nome, idade e cargo especificados
        Funcionario funcionario = new Funcionario("João", 30, "Desenvolvedor");

        // Atualiza o nome do funcionário utilizando o método setNome()
        funcionario.setNome("João Silva");

        // Atualiza a idade do funcionário utilizando o método setIdade()
        funcionario.setIdade(35);

        // Atualiza o cargo do funcionário utilizando o método setCargo()
        funcionario.setCargo("Gerente de Projetos");

        // Exibe o nome do funcionário utilizando o método getNome()
        System.out.println("Nome: " + funcionario.getNome());

        // Exibe a idade do funcionário utilizando o método getIdade()
        System.out.println("Idade: " + funcionario.getIdade());

        // Exibe o cargo do funcionário utilizando o método getCargo()
        System.out.println("Cargo: " + funcionario.getCargo());
    }
}
