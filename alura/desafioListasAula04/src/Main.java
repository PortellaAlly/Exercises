import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista1 = new ArrayList<>();

        lista1.add(6);
        lista1.add(7);
        lista1.add(5);
        lista1.add(1);
        lista1.add(4);

        Collections.sort(lista1);
        System.out.println(lista1);

    }
}