package QuestUm;

public class Carro {
    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void definirModelo(String nomeModelo){
        this.nomeModelo = nomeModelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo(){
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preco ano 1: " + precoAno1);
        System.out.println("Preco ano 2: " + precoAno2);
        System.out.println("Preco ano 3: " + precoAno3);
    }

    private double acharMenorValor(){
        double menorPreco = precoAno1;
        if(precoAno2 < menorPreco){
            menorPreco = precoAno2;
        }

        if(precoAno3 < menorPreco){
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double acharMaiorValor(){
        double maiorPreco = precoAno1;
        if(precoAno2 > maiorPreco){
            maiorPreco = precoAno2;
        }

        if(precoAno3 > maiorPreco){
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }
}
