import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Question 1
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ronaldo");
        lista.add("Receba");
        lista.add("Perceba");

        for(String elemento : lista){
            System.out.println(elemento);
        }

        // Question 2
        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

    }
}