package exercicio11;

public class Pessoa {

        // Atributo privado
        private int idade;

        // Método set para idade com validação
        public void setIdade(int idade) {
            if (idade > 0) {
                this.idade = idade;
            } else {
                System.out.println("Idade deve ser maior que zero.");
            }
        }
    
        // Método get para idade
        public int getIdade() {
            return this.idade;
        }
    
}
