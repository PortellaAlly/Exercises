import QuestDois.Cachorro;
import QuestDois.Gato;
import QuestUm.ModeloCarro;


public class Main {
    public static void main(String[] args) {
        // Questao 1
        ModeloCarro modeloCarro = new ModeloCarro();

        modeloCarro.definirModelo("Sedan");
        modeloCarro.definirPrecos(6000, 7000, 5700);
        modeloCarro.exibirInfo();

        // Questao 2
        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Destruidor de mundos");
        cachorro.emitirSom();
        cachorro.abanarRabo();

        System.out.println(cachorro.getNome());

        Gato gato = new Gato();

        gato.setNome("Megatron do rock");
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println(gato.getNome());

        // Questao 3

        }
}