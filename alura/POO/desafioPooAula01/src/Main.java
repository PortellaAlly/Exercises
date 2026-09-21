public class Main {
    public static void main(String[] args) {
        // Question 01
        Pessoa pessoa1 = new Pessoa();
        pessoa1.Cumprimentar();

        // Question 02
        Calculadora calculadora = new Calculadora();
        double result = calculadora.Dobro(67);
        System.out.println(result);

        // Question 03
        Musica musica = new Musica();

        musica.titulo = "Feet Don't Fail Me Now";
        musica.artista = "Joy Crookes";
        musica.anoLancamento = 2021;

        musica.ExibirFichaTecnica();

        musica.DarNota(8);
        musica.DarNota(9);
        musica.DarNota(7.5);

        double mediaNotaDaMusica = musica.FazerMediaAvaliacoes();
        System.out.println("A media de " + musica.titulo + " eh de " + mediaNotaDaMusica);

        // Question 04
        Carro carro = new Carro();

        carro.modelo = "Ford K";
        carro.cor = "preta";
        carro.FichaTecnica();

        int anoDoCarro = carro.AnoDoCarro();
        System.out.println(anoDoCarro);
    }
}

