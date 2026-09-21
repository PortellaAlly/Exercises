public class Carro {
    String modelo;
    int ano;
    String cor;

    void FichaTecnica(){
        System.out.println("Esse carro eh um " + modelo);
        System.out.println("De cor " + cor);
    }

    int AnoDoCarro(){
        return 2025 - ano;
    }
}
