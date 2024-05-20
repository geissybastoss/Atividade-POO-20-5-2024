package exercicio9;

public class Main {
    
    public static void main(String[] args) {
        // Instancia um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Define os atributos do objeto Carro
        meuCarro.setMarca("Toyota");
        meuCarro.setAno(2020);

        // Imprime os valores dos atributos
        System.out.println("Marca do carro: " + meuCarro.getMarca());
        System.out.println("Ano do carro: " + meuCarro.getAno());
    }

}
