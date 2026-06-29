import QuestaoDois.CalculadoraSalaRetangular;
import QuestaoTres.TabuadaMultiplicacao;
import QuestaoUm.ConversorMoeda;

public class Main {
    public static void main(String[] args) {
        // Questão 1
        ConversorMoeda conversorMoeda = new ConversorMoeda();

        conversorMoeda.converterDolarParaReal(5);

        // Questão 2
        CalculadoraSalaRetangular calculadoraSalaRetangular = new CalculadoraSalaRetangular();

        calculadoraSalaRetangular.calcularArea(22,13);
        calculadoraSalaRetangular.calcularPerimetro(13,22);

        // Questao 3
        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();

        tabuadaMultiplicacao.mostrarTabuada(2);
    }
}