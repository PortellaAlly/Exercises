import QuestaoDois.CalculadoraSalaRetangular;
import QuestaoQuatro.ConversorTemperaturaPadrao;
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

        // Questao 4
        ConversorTemperaturaPadrao conversorTemperaturaPadrao = new ConversorTemperaturaPadrao();

        System.out.println("Celsius para fahrenheit: " + conversorTemperaturaPadrao.celsiusParaFahrenheit(25));
        System.out.println("Fahrenheit para celsius: " + conversorTemperaturaPadrao.fahrenheitParaCelsius(70));
    }
}