package exercicio12;

public class Livro {
        // Atributos privados da classe Livro
        private String titulo;
        private String autor;
    
        // Construtor da classe que inicializa os atributos titulo e autor
        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }
    
        // Método getter para o atributo titulo
        public String getTitulo() {
            return titulo;
        }
    
        // Método setter para o atributo titulo
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    
        // Método getter para o atributo autor
        public String getAutor() {
            return autor;
        }
    
        // Método setter para o atributo autor
        public void setAutor(String autor) {
            this.autor = autor;
        }
}
