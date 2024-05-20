package exercicio18;

public class Main {
    
    public static void main(String[] args) {
        // Cria um objeto da classe Peixe
        Peixe meuPeixe = new Peixe("Nemo", 2, "Peixe-palhaço");

        // Define os atributos do objeto Peixe
        meuPeixe.setCaracteristica("Vive em anêmonas");

        // Imprime os dados do peixe
        meuPeixe.dadosPeixe();
    }
}
