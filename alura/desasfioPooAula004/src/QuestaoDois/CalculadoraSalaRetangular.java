package QuestaoDois;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    private double resultado;

    @Override
    public void calcularArea(double altura, double largura) {
        resultado = altura * largura;
        System.out.println("A área será de: " + resultado + " cm");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        resultado = 2 * (altura + largura);
        System.out.println("O perimetro será de: " + resultado + " cm");
    }
}
