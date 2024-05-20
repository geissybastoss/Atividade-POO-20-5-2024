package exercicio12;

public class Main {
    
    public static void main(String[] args) {
        // Cria uma nova instância de Livro com título "Dom Casmurro" e autor "Machado de Assis"
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis");

        // Imprime o título e o autor do livro
        System.out.println("Título do livro: " + livro.getTitulo());
        System.out.println("Autor do livro: " + livro.getAutor());

        // Modifica o título e o autor do livro
        livro.setTitulo("O Pequeno Príncipe");
        livro.setAutor("Antoine de Saint-Exupéry");

        // Imprime o novo título e o novo autor do livro
        System.out.println("Novo título do livro: " + livro.getTitulo());
        System.out.println("Novo autor do livro: " + livro.getAutor());
    }
}
