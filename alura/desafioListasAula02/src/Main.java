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

        // Question 3
        Animal animal1 = new Cachorro();
        if(animal1 instanceof Cachorro){
            Cachorro cachorro1 = (Cachorro) animal1;
        } else {
            System.out.println("nao eh um chacorro");
        }

        // Question 4
        double soma = 0.00;
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Sabonete", 3.99);
        Produto produto2 = new Produto("Shampoo", 11.99);
        Produto produto3 = new Produto("Ronaldinho", 99.59);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        for(Produto e : produtos){
            System.out.println(e);
            soma += e.getPreco();
        }

        System.out.println(soma / produtos.size());
    }
}