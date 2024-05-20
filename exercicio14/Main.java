package exercicio14;

public class Main {

    public static void main(String[] args) {
        // Instancia um objeto da classe Turma
        Turma turma = new Turma();

        // Define o atributo alunos do objeto Turma
        String[] listaDeAlunos = {"Alice", "Bruno", "Carla", "Diego"};
        turma.setAlunos(listaDeAlunos);

        // Imprime a lista de alunos
        System.out.println("Lista de alunos da turma:");
        for (String aluno : turma.getAlunos()) {
            System.out.println(aluno);
        }
    }
    
}
