import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Ronaldo");
        lista.add("Receba");
        lista.add("Perceba");

        for(String elemento : lista){
            System.out.println(elemento);
        }
    }
}