package exercicio10;

public class Main {
    
    public static void main(String[] args) {
        // Cria uma nova instância de Aluno com nome "João" e nota 8.5
        Aluno aluno = new Aluno("João", 8.5);

        // Imprime o nome e a nota do aluno
        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Nota do aluno: " + aluno.getNota());

        // Modifica o nome e a nota do aluno
        aluno.setNome("Maria");
        aluno.setNota(9.0);

        // Imprime o novo nome e a nova nota do aluno
        System.out.println("Novo nome do aluno: " + aluno.getNome());
        System.out.println("Nova nota do aluno: " + aluno.getNota());
    }
}
