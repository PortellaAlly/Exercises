import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Question 1
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(6);
        lista1.add(7);
        lista1.add(5);
        lista1.add(1);
        lista1.add(4);

        Collections.sort(lista1);
        System.out.println(lista1);

        // Question 2
        ArrayList<Titulo> titulos = new ArrayList<>();

        titulos.add(new Titulo("Manifesto comunista"));
        titulos.add(new Titulo("Alem do bem e o mal"));
        titulos.add(new Titulo("Revolucao dos bixos"));

        Collections.sort(titulos);
        System.out.println(titulos);

        // Question 4
    }
}