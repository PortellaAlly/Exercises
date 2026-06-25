import QuestUm.ModeloCarro;


public class Main {
    public static void main(String[] args) {
        // Questao 1
        ModeloCarro modeloCarro = new ModeloCarro();

        modeloCarro.definirModelo("Sedan");
        modeloCarro.definirPrecos(6000, 7000, 5700);
        modeloCarro.exibirInfo();

        }
}