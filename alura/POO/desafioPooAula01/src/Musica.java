public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int avaliacao;
    int numAvaliacoes;

    void ExibirFichaTecnica() {
        System.out.println("O nome da musica eh: " + titulo);
        System.out.println("O artista eh: " + artista);
        System.out.println("foi lancada em: " + anoLancamento);
    }

    void DarNota(double nota){
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double FazerMediaAvaliacoes(){
        return somaAvaliacoes / numAvaliacoes;
    }
}
