import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Sabao", 6.77, 13);
        Produto produto2 = new Produto("Espada laser", 12.99, 22);

        produtos.add(produto1); produtos.add(produto2);
        System.out.println(produtos.size());
        System.out.println(produtos.get(1).getNome());

        for(Produto produto : produtos){
            System.out.println(produto);
        }

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Hamburguer", 22.99,67, "13/12/2013");
        System.out.println(produtoPerecivel);
    }
}